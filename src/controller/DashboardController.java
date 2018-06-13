package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.ProductColorDao;
import dao.PurchaseDao;

@Controller
@RequestMapping("/admin/")
public class DashboardController {
	@Autowired
	PurchaseDao purchaseDao;
	
	@Autowired
	ProductColorDao productColorDao;

	@RequestMapping("dashboard/order-management")
	public String orderManagement(ModelMap md) {
		md.addAttribute("orderList", purchaseDao.getAllPurchase());
		return "admin/dashboard/order-management";
	}

	@RequestMapping("dashboard/product-management")
	public String productManagement(ModelMap md) {
		md.addAttribute("productList", productColorDao.getAllProduct());
		return "admin/dashboard/product-management";
	}

}
