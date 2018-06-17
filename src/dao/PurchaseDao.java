package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import entity.Purchase;

@Component
public class PurchaseDao {

	@Autowired
	SessionFactory factory;
	
	@Transactional
	public List<Purchase> getAllPurchase(){
		Session session = factory.getCurrentSession();
		String hql = "from Purchase";
		Query query = session.createQuery(hql);
		List<Purchase> purchases =  query.list();
		return purchases;
	}
	
	@Transactional
	public Purchase getPurchasebyId(String purchase_no){
		Session session = factory.getCurrentSession();
		String hql = "from Purchase where purchase_no = :purchase_no";
		Query query = session.createQuery(hql);
		query.setParameter("purchase_no", purchase_no);
		Purchase purchase = (Purchase) query.uniqueResult();
		return purchase;
	}
	
	public void insertPurchase(Purchase purchase) {
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		try {
			session.save(purchase);
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
	}
}
