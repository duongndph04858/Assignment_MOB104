package controller;

import java.util.ArrayList;
import java.util.Vector;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dao.PRODUCT_DAO;
import entity.PRODUCT;

@Controller
public class CartController {
	@Autowired
	PRODUCT_DAO product_dao;

	@RequestMapping("add-to-cart")
	public String addToCart(HttpSession session,ModelMap md,@RequestParam String pId) {
		Vector<PRODUCT> cart_p = new Vector<>();
		PRODUCT product = product_dao.getProductByID(pId);
		int quantity=1;
		if(session.getAttribute("cart") == null) {
			cart_p.add(product);
			md.addAttribute("quantity", quantity);
			session.setAttribute("cart", cart_p);
			
		}else {
			if(cart_p.contains(product)) {
				
			}
			
		}
		return "";
	}
}
