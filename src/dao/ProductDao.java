package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import entity.Product;

@Component
public class ProductDao {

	@Autowired
	SessionFactory factory;

	@Transactional
	public List<Product> getAll() {
		Session session = factory.getCurrentSession();
		String hql = "from Product";
		Query query = session.createQuery(hql);
		List<Product> list_Allproduct = query.list();
		return list_Allproduct;
	}

	@Transactional
	public List<Product> getByProducer(String producer) {
		Session session = factory.getCurrentSession();
		String hql = "from Product where producer=:producer";
		Query query = session.createQuery(hql);
		query.setParameter("producer", producer);
		List<Product> list_product = query.list();
		return list_product;
	}

	@Transactional
	public List<Product> getAllPerPage(int start) {
		Session session = factory.getCurrentSession();
		String hql = "from Product";
		Query query = session.createQuery(hql);
		query.setFirstResult(start);
		query.setMaxResults(9);
		List<Product> list_product = query.list();
		return list_product;
	}

	@Transactional
	public List<Product> getProducerPerPage(int start, String producer) {
		Session session = factory.getCurrentSession();
		String hql = "from Product where producer=:producer";
		Query query = session.createQuery(hql);
		query.setParameter("producer", producer);
		query.setFirstResult(start);
		query.setMaxResults(9);
		List<Product> list_product = query.list();
		return list_product;
	}

	@Transactional
	public Product getProductByID(String id) {
		Session session = factory.getCurrentSession();
		String hql = "from Product where id=:id";
		Query query = session.createQuery(hql);
		query.setParameter("id", id);
		Product product = (Product) query.uniqueResult();
		return product;
	}

	@Transactional
	public List<Product> getSearchByName(String textSearch) {
		Session session = factory.getCurrentSession();
		String hql = "from Product where name like :textSearch or producer like :textSearch";
		Query query = session.createQuery(hql);
		query.setParameter("textSearch", "%" + textSearch + "%");
		List<Product> list_product = query.list();
		return list_product;
	}

	@Transactional
	public List<Product> getFilterByPrice(String producer, long priceMin, long priceMax) {
		Session session = factory.getCurrentSession();
		String hql = "from Product where producer=:producer and price >= :priceMin and price <= :priceMax";
		Query query = session.createQuery(hql);
		query.setParameter("producer", producer);
		query.setParameter("priceMin", priceMin);
		query.setParameter("priceMax", priceMax);
		List<Product> list_product = query.list();
		return list_product;
	}

	// test sort
	/*@Transactional
	public List<Product> getByProducer(String producer, String sort) {
		Session session = factory.getCurrentSession();
		String hql = "from Product where producer=:producer order by price :sort";
		Query query = session.createQuery(hql);
		query.setParameter("producer", producer);
		query.setParameter("sort", sort);
		List<Product> list_product = query.list();
		return list_product;
	}

	@Transactional
	public List<Product> getFilterByPrice(String producer, long priceMin, long priceMax, String sort) {
		Session session = factory.getCurrentSession();
		String hql = "from Product where producer=:producer and price >= :priceMin and price <= :priceMax order by price :sort";
		Query query = session.createQuery(hql);
		query.setParameter("producer", producer);
		query.setParameter("priceMin", priceMin);
		query.setParameter("priceMax", priceMax);
		query.setParameter("sort", sort);
		List<Product> list_product = query.list();
		return list_product;
	}*/
}
