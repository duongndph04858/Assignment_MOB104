package controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dao.Cart_DAO;
import dao.PRODUCT_DAO;
import entity.Cart;
import entity.PRODUCT;

@Controller
public class CartController {
	@Autowired
	PRODUCT_DAO product_dao;

	@RequestMapping("add-to-cart")
	public String addToCart(HttpSession session, ModelMap md, @RequestParam String pID,HttpServletRequest request) {	
		session = request.getSession(true);
		Cart_DAO shop=(Cart_DAO) session.getAttribute("shop");
		PRODUCT product = product_dao.getProductByID(pID);
		if (shop==null) {
			shop = new Cart_DAO();
		} 		
		shop.addToCart(new Cart(product.getId(),product));
		session.setAttribute("shop", shop);
		return "users/cart";
	}
}
