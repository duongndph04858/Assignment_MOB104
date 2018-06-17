package controller;

import java.io.File;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import dao.ProductColorDao;
import dao.ProductDao;
import dao.PurchaseDao;
import entity.Product;
import entity.ProductColors;

@Controller
@RequestMapping("/admin/")
public class DashboardController {
	@Autowired
	PurchaseDao purchaseDao;

	@Autowired
	ProductColorDao productColorDao;

	@Autowired
	ProductDao productDao;

	@Autowired
	ServletContext context;

	@RequestMapping("dashboard/order-management")
	public String orderManagement(ModelMap md) {
		md.addAttribute("orderList", purchaseDao.getAllPurchase());
		return "admin/dashboard/order-management";
	}

	@RequestMapping("dashboard/product-management")
	public String productManagement(ModelMap md) {
		md.addAttribute("productList", productColorDao.getAllProduct());
		md.addAttribute("totalProduct", productColorDao.getAmountProduct());
		return "admin/dashboard/product-management";
	}

	@RequestMapping(value = "/insert-product", method = RequestMethod.GET)
	public String insertPage() {
		return "admin/dashboard/insert-product";
	}

	@RequestMapping("insertProduct")
	public String insertProduct(@RequestParam String productID, @RequestParam String productName,
			@RequestParam long productPrice, @RequestParam String brandList, @RequestParam int productAmount,
			@RequestParam String colorList, @RequestParam String productMonitor, @RequestParam String productOS,
			@RequestParam String productCamera, @RequestParam String productFrontCamera,
			@RequestParam String productCPU, @RequestParam String productRAM, @RequestParam String productROM,
			@RequestParam String productSIM, @RequestParam String productPIN,
			@RequestParam(value = "productDescription", defaultValue = "", required = false) String productDescription,
			@RequestParam MultipartFile productFrontImg, @RequestParam MultipartFile productBehindImg,
			@RequestParam MultipartFile productThicknessImg) {
		if (!(productFrontImg.isEmpty() || productBehindImg.isEmpty() || productThicknessImg.isEmpty())) {
			try {
				String productFrontImgPath = context.getRealPath("/images/" + productFrontImg.getOriginalFilename());
				productFrontImg.transferTo(new File(productFrontImgPath));
				String productBehindImgPath = context.getRealPath("/images/" + productBehindImg.getOriginalFilename());
				productBehindImg.transferTo(new File(productBehindImgPath));
				String productThicknessImgPath = context
						.getRealPath("/images/" + productThicknessImg.getOriginalFilename());
				productThicknessImg.transferTo(new File(productThicknessImgPath));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		Product product = new Product(productID, productName, productPrice, brandList, productAmount, productMonitor,
				productOS, productCamera, productFrontCamera, productCPU, productRAM, productROM, productSIM,
				productPIN, productDescription);
		boolean kq1 = productDao.inserProduct(product);
		if (kq1 == true) {
			ProductColors productColors = new ProductColors(product, colorList, productFrontImg.getOriginalFilename(),
					productBehindImg.getOriginalFilename(), productThicknessImg.getOriginalFilename());
			boolean kq = productColorDao.inserProductColor(productColors);
			if (kq == true) {
				return "redirect:/admin/dashboard/product-management.htm";
			} else {
				return "admin/dashboard/insert-product";
			}
		} else {
			return "admin/dashboard/insert-product";
		}

	}
	
	
	@RequestMapping("filter-by-producer")
	public String filterByProducer(ModelMap md, @RequestParam String sellist){
		if(sellist.equals("1")) {
			md.addAttribute("productList", productColorDao.getAllProduct());
		} else if(sellist.equals("2")) {
			md.addAttribute("productList", productColorDao.getProductByProducer("Apple"));
		} else if(sellist.equals("3")) {
			md.addAttribute("productList", productColorDao.getProductByProducer("Samsung"));
		} else if(sellist.equals("4")) {
			md.addAttribute("productList", productColorDao.getProductByProducer("OPPO"));
		} else if(sellist.equals("5")) {
			md.addAttribute("productList", productColorDao.getProductByProducer("Xiaomi"));
		} else if(sellist.equals("6")) {
			md.addAttribute("productList", productColorDao.getProductByProducer("Sony"));
		}
		md.addAttribute("sellist", sellist);
		return "admin/dashboard/product-management";
	}

}
