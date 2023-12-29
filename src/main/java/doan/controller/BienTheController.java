package doan.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import doan.dao.BienTheDAO;
import doan.dao.SanPhamDAO;
import doan.entities.BienThe;
import doan.entities.SanPham;

@Controller
public class BienTheController {
	@Autowired
	private BienTheDAO bientheDAO;
	@Autowired
	private SanPhamDAO sanphamDAO;
	@RequestMapping(value = {"/listBienThe"})
	public String listBienThe(Model model) {
		List<BienThe> list = bientheDAO.getBienThe();
		model.addAttribute("list", list);
		return "listBienThe";
	}
	@RequestMapping("/initInsertBienThe")
	public String initInsert(Model model) {
		List<SanPham> sanpham = sanphamDAO.getSanPham();
		model.addAttribute("listSanPham",sanpham);
		BienThe b = new BienThe();
		model.addAttribute("b",b);
		
		return"insertBienThe";	
	}
	@RequestMapping("/insertBienThe")
	public String insertSanPham(@ModelAttribute("b")BienThe b,Model model) {
		boolean bl = bientheDAO.insertBienThe(b);
		if(bl) {
			return "redirect:/listSanPham";
		}else {
				model.addAttribute("error","Lỗi!");
				List<SanPham> sanpham = sanphamDAO.getSanPham();
				model.addAttribute("listSanPham",sanpham);
				model.addAttribute("b",b);
				return"insertBienThe";	
		}
	}
	@RequestMapping("/preUpdateBienThe")
	public String preUpdateBienThe(@RequestParam("id_bien_the")Integer id_bien_the, Model model
	){
	BienThe objBienThe = bientheDAO.getBienTheById(id_bien_the);
	List<SanPham> listSanPham = sanphamDAO.getSanPham();
	model.addAttribute("b", objBienThe);
	model.addAttribute("listSanPham", listSanPham);
	return "updateBienThe";
	}
	@RequestMapping("/updateBienThe")
	public String updateCity(@ModelAttribute("b")BienThe b, Model model) {
	boolean bl = bientheDAO.updateBienThe(b);
	if(bl) {
	return "redirect:/listCity";
	}else {
	model.addAttribute("err", "Update failed!");
	List<SanPham> listSanPham = sanphamDAO.getSanPham();
	model.addAttribute("b", b);
	model.addAttribute("listSanPham", listSanPham);
	return "updateBienThe";
	}
	}
}