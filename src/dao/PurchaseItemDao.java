package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import entity.PurchaseItem;

@Component
public class PurchaseItemDao {
	@Autowired
	SessionFactory factory;
	
	@Transactional
	public List<PurchaseItem> getPurchaseItem(int purchase_id){
		Session session = factory.getCurrentSession();
		String hql = "from PurchaseItem where purchase_id.id = :purchase_id";
		Query query = session.createQuery(hql);
		query.setParameter("purchase_id", purchase_id);
		List<PurchaseItem> listPurchaseItem = query.list();
		return listPurchaseItem;
	}

}
