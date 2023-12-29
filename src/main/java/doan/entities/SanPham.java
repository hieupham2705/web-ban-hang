package doan.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_san_pham")
public class SanPham {
	@Id
	@Column(name = "id_san_pham")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_san_pham;
	@Column(name = "ten_san_pham")
	private String ten_san_pham;
	@ManyToOne
	@JoinColumn(name = "id_danh_muc", referencedColumnName = "id_danh_muc")
	private DanhMucSanPham danhmucsanpham;
	@OneToMany(mappedBy = "sanpham", fetch = FetchType.EAGER)
	private Set<BienThe> bienthe;
	@Column(name = "hinh_anh")
	private String hinh_anh;
	@Column(name = "trang_thai")
	private boolean trang_thai;
	
	public SanPham() {
		// TODO Auto-generated constructor stub
	}

	public SanPham(int id_san_pham, String ten_san_pham, DanhMucSanPham danhmucsanpham, Set<BienThe> bienthe,
			String hinh_anh, boolean trang_thai) {
		super();
		this.id_san_pham = id_san_pham;
		this.ten_san_pham = ten_san_pham;
		this.danhmucsanpham = danhmucsanpham;
		this.bienthe = bienthe;
		this.hinh_anh = hinh_anh;
		this.trang_thai = trang_thai;
	}

	public int getId_san_pham() {
		return id_san_pham;
	}

	public void setId_san_pham(int id_san_pham) {
		this.id_san_pham = id_san_pham;
	}

	public String getTen_san_pham() {
		return ten_san_pham;
	}

	public void setTen_san_pham(String ten_san_pham) {
		this.ten_san_pham = ten_san_pham;
	}

	public DanhMucSanPham getDanhmucsanpham() {
		return danhmucsanpham;
	}

	public void setDanhmucsanpham(DanhMucSanPham danhmucsanpham) {
		this.danhmucsanpham = danhmucsanpham;
	}

	public Set<BienThe> getBienthe() {
		return bienthe;
	}

	public void setBienthe(Set<BienThe> bienthe) {
		this.bienthe = bienthe;
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
	
}