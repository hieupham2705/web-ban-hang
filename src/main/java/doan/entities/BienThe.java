package doan.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_bien_the")
public class BienThe {
	@Id
	@Column(name = "id_bien_the")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_bien_the;
	@ManyToOne
	@JoinColumn(name = "id_san_pham",referencedColumnName ="id_san_pham")
	private SanPham sanpham;
	@Column(name = "hinh_anh")
	private String hinh_anh;
	@Column(name = "mo_ta")
	private String mo_ta;
	@Column(name = "ngay_nhap")
	private Date ngay_nhap;
	@Column(name = "luot_xem")
	private int luot_xem;
	@Column(name = "don_vi")
	private double don_vi;
	@Column(name = "don_gia")
	private double don_gia;
	@Column(name = "gia_khuyen_mai")
	private double gia_khuyen_mai;
	@Column(name = "so_luong")
	private int so_luong;
	@Column(name = "trang_thai")
	private boolean trang_thai;
	
	public BienThe() {
		// TODO Auto-generated constructor stub
	}

	public BienThe(int id_bien_the, SanPham sanpham, String hinh_anh, String mo_ta, Date ngay_nhap, int luot_xem,
			double don_vi, double don_gia, double gia_khuyen_mai, int so_luong, boolean trang_thai) {
		super();
		this.id_bien_the = id_bien_the;
		this.sanpham = sanpham;
		this.hinh_anh = hinh_anh;
		this.mo_ta = mo_ta;
		this.ngay_nhap = ngay_nhap;
		this.luot_xem = luot_xem;
		this.don_vi = don_vi;
		this.don_gia = don_gia;
		this.gia_khuyen_mai = gia_khuyen_mai;
		this.so_luong = so_luong;
		this.trang_thai = trang_thai;
	}

	public int getId_bien_the() {
		return id_bien_the;
	}

	public void setId_bien_the(int id_bien_the) {
		this.id_bien_the = id_bien_the;
	}

	public SanPham getSanpham() {
		return sanpham;
	}

	public void setSanpham(SanPham sanpham) {
		this.sanpham = sanpham;
	}

	public String getHinh_anh() {
		return hinh_anh;
	}

	public void setHinh_anh(String hinh_anh) {
		this.hinh_anh = hinh_anh;
	}

	public String getMo_ta() {
		return mo_ta;
	}

	public void setMo_ta(String mo_ta) {
		this.mo_ta = mo_ta;
	}

	public Date getNgay_nhap() {
		return ngay_nhap;
	}

	public void setNgay_nhap(Date ngay_nhap) {
		this.ngay_nhap = ngay_nhap;
	}

	public int getLuot_xem() {
		return luot_xem;
	}

	public void setLuot_xem(int luot_xem) {
		this.luot_xem = luot_xem;
	}

	public double getDon_vi() {
		return don_vi;
	}

	public void setDon_vi(double don_vi) {
		this.don_vi = don_vi;
	}

	public double getDon_gia() {
		return don_gia;
	}

	public void setDon_gia(double don_gia) {
		this.don_gia = don_gia;
	}

	public double getGia_khuyen_mai() {
		return gia_khuyen_mai;
	}

	public void setGia_khuyen_mai(double gia_khuyen_mai) {
		this.gia_khuyen_mai = gia_khuyen_mai;
	}

	public int getSo_luong() {
		return so_luong;
	}

	public void setSo_luong(int so_luong) {
		this.so_luong = so_luong;
	}

	public boolean isTrang_thai() {
		return trang_thai;
	}

	public void setTrang_thai(boolean trang_thai) {
		this.trang_thai = trang_thai;
	}
	
	
}