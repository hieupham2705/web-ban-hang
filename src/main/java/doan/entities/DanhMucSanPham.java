package doan.entities;
import java.util.Set;

import javax.persistence.Column;
  import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
  import javax.persistence.GenerationType;
  import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_danh_muc_san_pham")
public class DanhMucSanPham {
	@Id
	@Column(name = "id_danh_muc")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_danh_muc;
	@Column(name = "ten_danh_muc")
	private String ten_danh_muc;
	@Column (name = "hinh_anh")
	private String hinh_anh;
	@Column(name = "trang_thai")
	private boolean trang_thai;
	@OneToMany(mappedBy = "danhmucsanpham", fetch = FetchType.EAGER)
	private Set<SanPham> sanpham;
	
	public DanhMucSanPham() {
		// TODO Auto-generated constructor stub
	}

	public DanhMucSanPham(int id_danh_muc, String ten_danh_muc, String hinh_anh, boolean trang_thai,
			Set<SanPham> sanpham) {
		super();
		this.id_danh_muc = id_danh_muc;
		this.ten_danh_muc = ten_danh_muc;
		this.hinh_anh = hinh_anh;
		this.trang_thai = trang_thai;
		this.sanpham = sanpham;
	}

	public int getId_danh_muc() {
		return id_danh_muc;
	}

	public void setId_danh_muc(int id_danh_muc) {
		this.id_danh_muc = id_danh_muc;
	}

	public String getTen_danh_muc() {
		return ten_danh_muc;
	}

	public void setTen_danh_muc(String ten_danh_muc) {
		this.ten_danh_muc = ten_danh_muc;
	}

	public String getHinh_anh() {
		return hinh_anh;
	}

	public void setHinh_anh(String hinh_anh) {
		this.hinh_anh = hinh_anh;
	}

	public boolean isTrang_thai() {
		return trang_thai;
	}

	public void setTrang_thai(boolean trang_thai) {
		this.trang_thai = trang_thai;
	}

	public Set<SanPham> getSanpham() {
		return sanpham;
	}

	public void setSanpham(Set<SanPham> sanpham) {
		this.sanpham = sanpham;
	}
}
