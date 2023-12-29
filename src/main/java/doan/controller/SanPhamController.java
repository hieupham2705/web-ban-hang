package doan.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import doan.dao.DanhMucSanPhamDAO;
import doan.dao.SanPhamDAO;
import doan.entities.DanhMucSanPham;
import doan.entities.SanPham;

@Controller
public class SanPhamController {
	@Autowired
	private SanPhamDAO sanphamDAO;
	@Autowired
	private DanhMucSanPhamDAO danhmucDAO;
	@RequestMapping(value = {"/listSanPham"})
	public String listSanPham(Model model) {
		List<SanPham> list = sanphamDAO.getSanPham();
		model.addAttribute("list", list);
		return "listSanPham";
	}
	@RequestMapping(value = {"/initInsertSanPham"})
	public String initInsert(Model model) {
		try {
			List<DanhMucSanPham> danhmuc= danhmucDAO.getDanhMucSanPham();
			model.addAttribute("listDanhMuc",danhmuc);
			SanPham s = new SanPham();
			model.addAttribute("s",s);
			
			return"insertSanPham";	
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	@RequestMapping("/insertSanPham")
	public String insertSanPham(@ModelAttribute("s")SanPham s,@RequestParam("imgFile")MultipartFile imgFile,Model model, HttpServletRequest request) {
		//xu ly upload anh
		String path = request.getServletContext().getRealPath("resources/images");
		File f = new File(path);
		File destination = new File(f.getAbsolutePath()+"/"+imgFile.getOriginalFilename());
		if(!destination.exists()) {
			try {
				Files.write(destination.toPath(),imgFile.getBytes(),StandardOpenOption.CREATE_NEW);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		s.setHinh_anh(imgFile.getOriginalFilename());
		boolean bl = sanphamDAO.insertSanPham(s);
		if(bl) {
			return "redirect:/listSanPham";
		}else {
				model.addAttribute("error","Lỗi!");
				List<DanhMucSanPham> danhmuc= danhmucDAO.getDanhMucSanPham();
				model.addAttribute("listDanhMuc",danhmuc);
				model.addAttribute("s",s);
				return"insertSanPham";	
		}
	}
	@RequestMapping("/deleteCity")
	public String deleteSanPham(@RequestParam("id_san_pham")Integer id_san_pham, Model model) {
	boolean bl = sanphamDAO.deleteSanPham(id_san_pham);
	if(bl) {
	model.addAttribute("success", "Delete successfully!");
	}else {
	model.addAttribute("err", "Delete failed!");
	}
	List<SanPham> list = sanphamDAO.getSanPham();
	model.addAttribute("list", list);
	return "listSanPham";
	}
}