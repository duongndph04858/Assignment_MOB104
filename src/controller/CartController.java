package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import dao.CartDao;
import dao.ProductColorDao;
import dao.ProductDao;
import entity.Cart;
import entity.ProductColors;

@Controller
public class CartController {
	@Autowired
	ProductDao productDao;
	@Autowired
	ProductColorDao productColorDao;
	@Autowired
	CartDao cartDao;

	@RequestMapping("add-to-cart")
	public String addToCart(HttpSession session, ModelMap md, @RequestParam String pID, HttpServletRequest request,
			@RequestParam String color) {
		session = request.getSession(true);
		cartDao = (CartDao) session.getAttribute("shop");
		ProductColors productColor = productColorDao.getProductColor(pID, color);
		if (cartDao == null) {
			cartDao = new CartDao();
		}
		cartDao.addToCart(new Cart(pID, productColor,color),color);
		session.setAttribute("shop", cartDao);
		System.out.println(cartDao.getTotalPrice());
		session.setAttribute("total", cartDao.getTotalPrice());
		return "users/cart";
		
	}
	
	@RequestMapping("remove-to-cart")
	public String removeToCart(@RequestParam String pID,@RequestParam String color,HttpSession session) {
		cartDao.removeToCart(pID, color);
		return "users/cart";
	}
}
