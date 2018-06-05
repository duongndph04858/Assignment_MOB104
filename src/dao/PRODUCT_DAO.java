package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import entity.PRODUCT;

@Component
public class PRODUCT_DAO {
	
	@Autowired
	SessionFactory  factory;
	
	@Transactional
	public List<PRODUCT> getAll() {
		Session session = factory.getCurrentSession();
		String hql = "from PRODUCT";
		Query query = session.createQuery(hql);
		List<PRODUCT> list_Allproduct = query.list();
		return list_Allproduct;
	}
	
	
	@Transactional
	public List<PRODUCT> getByProducer(String producer) {
		Session session = factory.getCurrentSession();
		String hql = "from PRODUCT where producer=:producer";
		Query query = session.createQuery(hql);
		query.setParameter("producer", producer);
		List<PRODUCT> list_product = query.list();
		return list_product;
	}
	
	@Transactional
	public List<PRODUCT> getAllPerPage(int start) {
		Session session = factory.getCurrentSession();
		String hql = "from PRODUCT";
		Query query = session.createQuery(hql);
		query.setFirstResult(start);
		query.setMaxResults(9);
		List<PRODUCT> list_product = query.list();
		return list_product;
	}
	
	@Transactional
	public List<PRODUCT> getProducerPerPage(int start, String producer) {
		Session session = factory.getCurrentSession();
		String hql = "from PRODUCT where producer=:producer";
		Query query = session.createQuery(hql);
		query.setParameter("producer", producer);
		query.setFirstResult(start);
		query.setMaxResults(9);
		List<PRODUCT> list_product = query.list();
		return list_product;
	}
	
	@Transactional
	public PRODUCT getProductByID(String id) {
		Session session = factory.getCurrentSession();
		String hql = "from PRODUCT where id=:id";
		Query query = session.createQuery(hql);
		query.setParameter("id", id);
		PRODUCT product = (PRODUCT) query.uniqueResult();
		return product;
	}
	
}
