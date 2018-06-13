package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.PurchaseDao;

@Controller
@RequestMapping("/admin/")
public class DashboardController {
	@Autowired
	PurchaseDao purchaseDao;

	@RequestMapping("dashboard/order-management")
	public String orderManagement(ModelMap md) {
		return "admin/dashboard/order-management";
	}

	@RequestMapping("dashboard/product-management")
	public String productManagement(ModelMap md) {
		return "admin/dashboard/product-management";
	}

}
