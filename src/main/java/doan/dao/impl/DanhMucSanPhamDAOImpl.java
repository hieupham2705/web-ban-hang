package doan.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import doan.dao.DanhMucSanPhamDAO;
import doan.entities.DanhMucSanPham;

public class DanhMucSanPhamDAOImpl implements DanhMucSanPhamDAO {
	@Autowired
	private SessionFactory sessionFactory; 
	@Override
	public List<DanhMucSanPham> getDanhMucSanPham() {
		Session session = sessionFactory.openSession();
		try {
			List list = session.createQuery("from DanhMucSanPham").list();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			session.close();
		}
		return null;
	}

}
