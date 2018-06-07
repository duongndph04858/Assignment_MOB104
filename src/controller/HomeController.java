package controller;

import java.util.List;
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
		md.addAttribute("active", "active");
		return "users/index";
	}
	
	@RequestMapping("product")
	public String iphone(ModelMap md,@RequestParam String producer) {
		List<PRODUCT> lstProduct= product_dao.getByProducer(producer);
		md.addAttribute("lstProduct", lstProduct);
		md.addAttribute("producer", producer);
		return "users/product";
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
	
	@RequestMapping("search")
	public String searchTest(ModelMap md, @RequestParam String textSearch) {
		List<PRODUCT> lstSearch = product_dao.getSearchByName(textSearch);
		md.addAttribute("lstSearch", lstSearch);
		return "users/search";
	}
}
