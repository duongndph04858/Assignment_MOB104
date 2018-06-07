package dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import entity.ProductColors;

@Component
public class ProductColorDao {

	@Autowired
	SessionFactory factory;
	
	@Transactional
	public ProductColors getProductColor(String productId, String color) {
		Session session = factory.openSession();
		String hql = "from ProductColors where product =:productId and color =:color";
		Query query = session.createQuery(hql);
		query.setParameter("productId", productId);
		query.setParameter("color",color);
		ProductColors productColor =(ProductColors) query.uniqueResult();
		return productColor;
	}
}