package controller;

import java.util.List;

import javax.xml.ws.RequestWrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dao.PRODUCT_DAO;
import entity.PRODUCT;

@Controller
public class HomeController {
	@Autowired
	PRODUCT_DAO product_dao;

	@RequestMapping(value="home")
	public String home(ModelMap md,@RequestParam(value="start",defaultValue="0")int start) {
		List<PRODUCT> list_All = product_dao.getAll();
		List<PRODUCT> lst_AllperPage= product_dao.getAllPerPage(start);
		md.addAttribute("lst_AllperPage", lst_AllperPage);
		int pageNumber = Math.round(list_All.size()/9);
		md.addAttribute("pageNumber",pageNumber );
		md.addAttribute("startIndex", start);
		return "users/index";
	}
	
	@RequestMapping("iphone")
	public String iphone(ModelMap md) {
		List<PRODUCT> lstIphone= product_dao.getByProducer("Apple");
		md.addAttribute("lstIphone", lstIphone);
		return "users/iphone";
	}


	@RequestMapping("xiaomi")
	public String lenovo(ModelMap md) {
		List<PRODUCT> lstXiaomi= product_dao.getByProducer("Xiaomi");
		md.addAttribute("lstXiaomi", lstXiaomi);
		return "users/xiaomi";
	}
	
	@RequestMapping("oppo")
	public String oppo(ModelMap md) {
		List<PRODUCT> lstOPPO= product_dao.getByProducer("OPPO");
		md.addAttribute("lstOPPO", lstOPPO);
		return "users/oppo";
	}
	
	@RequestMapping("sony")
	public String sony(ModelMap md) {
		List<PRODUCT> lstSony= product_dao.getByProducer("Sony");
		md.addAttribute("lstSony", lstSony);
		return "users/sony";
	}
	
	@RequestMapping("samsung")
	public String samsung(ModelMap md) {
		List<PRODUCT> lstSamsung= product_dao.getByProducer("Samsung");
		md.addAttribute("lstSamsung", lstSamsung);
		return "users/samsung";
	}
	
	@RequestMapping("product-info")
	public String information(ModelMap md,@RequestParam("pId") String id) {
		PRODUCT product = product_dao.getProductByID(id);
		md.addAttribute("product", product);
		return "users/product-info";
	}
	
	@RequestMapping("cart")
	public String cart() {
		return "users/cart";
	}
}
