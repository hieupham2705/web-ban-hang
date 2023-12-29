package doan.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import doan.dao.BienTheDAO;
import doan.entities.BienThe;
@Repository
public class BienTheDAOImpl implements BienTheDAO {
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public List<BienThe> getBienThe() {
		Session session = sessionFactory.openSession();
		try {
			List list = session.createQuery("from BienThe").list();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return null;
	}

	@Override
	public boolean insertBienThe(BienThe b) {
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.save(b);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}finally {
			session.close();
		}
		return false;
	}

	@Override
	public BienThe getBienTheById(Integer id_bien_the) {
		Session session = sessionFactory.openSession();
		try {
		session.beginTransaction();
		BienThe b = (BienThe) session.createQuery("from BienThe where id_bien_the = :id_bien_the")
		.setParameter("id_bien_the",id_bien_the)
		.uniqueResult();
		session.getTransaction().commit();
		return b;
		} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		session.getTransaction().rollback();
		}finally {
		session.close();
		}
		return null;
		}

	@Override
	public boolean updateBienThe(BienThe b) {
		Session session = sessionFactory.openSession();
		try {
		session.beginTransaction();
		session.update(b);
		session.getTransaction().commit();
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
	}
