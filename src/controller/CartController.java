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
import entity.Product;

@Controller
public class CartController {
	@Autowired
	ProductDao productDao;
	@Autowired
	ProductColorDao pclD;

	@RequestMapping("add-to-cart")
	public String addToCart(HttpSession session, ModelMap md, @RequestParam String pID,HttpServletRequest request/*,
			@RequestParam String color*/) {	
		session = request.getSession(true);
		CartDao shop=(CartDao) session.getAttribute("shop");
		Product product = productDao.getProductByID(pID);
		if (shop==null) {
			shop = new CartDao();
		} 		
		session.setAttribute("shop", shop);
		return "users/cart";
	}
}
