package doan.dao;
	import java.util.List;
	import doan.entities.SanPham;
public interface SanPhamDAO {
	public List<SanPham> getSanPham();
	public boolean insertSanPham(SanPham s);
	public SanPham getSanPhamById(Integer id_san_pham);
	public boolean deleteSanPham(Integer id_san_pham);
}
