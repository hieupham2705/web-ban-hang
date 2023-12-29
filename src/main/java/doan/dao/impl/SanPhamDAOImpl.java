package doan.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import doan.dao.SanPhamDAO;
import doan.entities.SanPham;

@Repository
public class SanPhamDAOImpl implements SanPhamDAO {
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public List<SanPham> getSanPham() {
		Session session = sessionFactory.openSession();
		try {
			//List list = session.createQuery("from SanPham").list();
			//return list;
			List list = session.createQuery("from SanPham").list();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return null;
	}
	@Override
	public boolean insertSanPham(SanPham s) {
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.save(s);
			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}finally {
			session.close();
		}
		return false;
	}
	@Override
	public boolean deleteSanPham(Integer id_san_pham) {
		Session session = sessionFactory.openSession();
		try {
		session.beginTransaction();
		int i = session.createQuery("delete from SanPham where id_san_pham = :id_san_pham")
		.setParameter("id_san_pham", id_san_pham)
		.executeUpdate();
		session.getTransaction().commit();
		if(i>0)
		return true;
		} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		session.getTransaction().rollback();
		}finally {
		session.close();
		}
		return false;
		}
	@Override
	public SanPham getSanPhamById(Integer id_san_pham) {
		Session session = sessionFactory.openSession();
		try {
		session.beginTransaction();
		SanPham s = (SanPham) session.createQuery("from SanPham where id_san_pham = :id_san_pham"
		)
		.setParameter("id_san_pham", id_san_pham)
		.uniqueResult();
		session.getTransaction().commit();
		return s;
		} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		session.getTransaction().rollback();
		}finally {
		session.close();
		}
		return null;
	}

}