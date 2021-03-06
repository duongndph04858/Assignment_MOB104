package controller;

import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dao.ProductDao;
import dao.UsersDao;
import entity.Product;
import entity.Users;

@Controller
public class HomeController {
	@Autowired
	ProductDao product_dao;
	@Autowired
	UsersDao userDao;
	@Autowired
	JavaMailSender mailer;

	@RequestMapping(value = "home")
	public String home(ModelMap md, @RequestParam(value = "start", defaultValue = "0") int start) {
		List<Product> list_All = product_dao.getAll();
		List<Product> lst_AllperPage = product_dao.getAllPerPage(start);
		md.addAttribute("lst", lst_AllperPage);
		int pageNumber = Math.round(list_All.size() / 9);
		md.addAttribute("pageNumber", pageNumber);
		md.addAttribute("startIndex", start);
		md.addAttribute("active", "active");
		return "users/index";
	}

	@RequestMapping("product")
	public String iphone(ModelMap md, @RequestParam String producer) {
		List<Product> lstProduct = product_dao.getByProducerAsc(producer);
		md.addAttribute("lstProduct", lstProduct);
		md.addAttribute("producer", producer);
		return "users/product";
	}

	@RequestMapping("product-info")
	public String information(ModelMap md, @RequestParam("pId") String id) {
		Product product = product_dao.getProductByID(id);
		md.addAttribute("product", product);
		return "users/product-info";
	}

	@RequestMapping("cart")
	public String cart() {
		return "users/cart";
	}

	@RequestMapping("search")
	public String searchTest(ModelMap md, @RequestParam String textSearch) {
		List<Product> lstSearch = product_dao.getSearchByName(textSearch);
		md.addAttribute("lstSearch", lstSearch);
		return "users/search";
	}

	@RequestMapping("user-infor")
	public String userInfor() {
		return "users/user-infor";
	}

	@RequestMapping("change-password")
	public String changePassword(@RequestParam String oldPassword, @RequestParam String newPassword,
			@RequestParam String rePassword, HttpServletRequest request, ModelMap md) {
		HttpSession session = request.getSession();
		Users user = (Users) session.getAttribute("user");
		if (user.getPassword().equals(oldPassword) && newPassword.equals(rePassword)) {
			user.setPassword(newPassword);
			boolean kq = userDao.updateUser(user);
			if (kq == true) {
				return "redirect:/logout.htm";
			} else {
				md.addAttribute("errorr", "Đổi mật khẩu thất bại!");
				if (!(user.getPassword().equals(oldPassword))) {
					md.addAttribute("changeError", "Bạn nhập mật khẩu cũ không chính xác!");
					return "users/user-infor";
				} else {
					md.addAttribute("changeError", "Mật khẩu và nhập lại mật khẩu không khớp !");
					return "users/user-infor";
				}

			}
		} else {
			return "users/user-infor";
		}
	}

	/*
	 * @RequestMapping(value="filter") public String filter(ModelMap
	 * md,@RequestParam String inputHidden ,@RequestParam String filterPrice) {
	 * String producer = inputHidden; if(filterPrice.equals("all")) { List<Product>
	 * lstProduct = product_dao.getByProducer(inputHidden);
	 * md.addAttribute("lstProduct", lstProduct); } else { long priceMin; long
	 * priceMax; if(filterPrice.equals("op1")) { priceMin = 0; priceMax = 1000000; }
	 * else if(filterPrice.equals("op2")) { priceMin = 1000000; priceMax = 2000000;
	 * } else if(filterPrice.equals("op3")) { priceMin = 2000000; priceMax =
	 * 5000000; } else if(filterPrice.equals("op4")) { priceMin = 5000000; priceMax
	 * = 10000000; } else { priceMin = 10000000; priceMax = 1000000000; }
	 * List<Product> lstProduct = product_dao.getFilterByPrice(inputHidden,
	 * priceMin, priceMax); md.addAttribute("lstProduct", lstProduct); }
	 * md.addAttribute("filterPrice", filterPrice); md.addAttribute("producer",
	 * producer); return "users/product"; }
	 */

	// sort by price test
	@RequestMapping("sort-by-price")
	public String sort(ModelMap md, @RequestParam String inputHidden, @RequestParam String filterPrice,
			@RequestParam String sort) {
		String producer = inputHidden;
		if (filterPrice.equals("all")) {
			if (sort.equals("2")) {
				List<Product> lstProduct = product_dao.getByProducerDesc(inputHidden);
				md.addAttribute("lstProduct", lstProduct);
			} else {
				List<Product> lstProduct = product_dao.getByProducerAsc(inputHidden);
				md.addAttribute("lstProduct", lstProduct);
			}
		} else {
			long priceMin;
			long priceMax;
			if (filterPrice.equals("op1")) {
				priceMin = 0;
				priceMax = 1000000;
				if (sort.equals("2")) {
					List<Product> lstProduct = product_dao.getFilterByPriceDesc(inputHidden, priceMin, priceMax);
					md.addAttribute("lstProduct", lstProduct);
				} else {
					List<Product> lstProduct = product_dao.getFilterByPriceAsc(inputHidden, priceMin, priceMax);
					md.addAttribute("lstProduct", lstProduct);
				}
			} else if (filterPrice.equals("op2")) {
				priceMin = 1000000;
				priceMax = 2000000;
				if (sort.equals("2")) {
					List<Product> lstProduct = product_dao.getFilterByPriceDesc(inputHidden, priceMin, priceMax);
					md.addAttribute("lstProduct", lstProduct);
				} else {
					List<Product> lstProduct = product_dao.getFilterByPriceAsc(inputHidden, priceMin, priceMax);
					md.addAttribute("lstProduct", lstProduct);
				}

			} else if (filterPrice.equals("op3")) {
				priceMin = 2000000;
				priceMax = 5000000;
				if (sort.equals("2")) {
					List<Product> lstProduct = product_dao.getFilterByPriceDesc(inputHidden, priceMin, priceMax);
					md.addAttribute("lstProduct", lstProduct);
				} else {
					List<Product> lstProduct = product_dao.getFilterByPriceAsc(inputHidden, priceMin, priceMax);
					md.addAttribute("lstProduct", lstProduct);
				}

			} else if (filterPrice.equals("op4")) {
				priceMin = 5000000;
				priceMax = 10000000;
				if (sort.equals("2")) {
					List<Product> lstProduct = product_dao.getFilterByPriceDesc(inputHidden, priceMin, priceMax);
					md.addAttribute("lstProduct", lstProduct);
				} else {
					List<Product> lstProduct = product_dao.getFilterByPriceAsc(inputHidden, priceMin, priceMax);
					md.addAttribute("lstProduct", lstProduct);
				}

			} else {
				priceMin = 10000000;
				priceMax = 1000000000;
				if (sort.equals("2")) {
					List<Product> lstProduct = product_dao.getFilterByPriceDesc(inputHidden, priceMin, priceMax);
					md.addAttribute("lstProduct", lstProduct);
				} else {
					List<Product> lstProduct = product_dao.getFilterByPriceAsc(inputHidden, priceMin, priceMax);
					md.addAttribute("lstProduct", lstProduct);
				}
			}
		}
		md.addAttribute("filterPrice", filterPrice);
		md.addAttribute("sort", sort);
		md.addAttribute("producer", producer);
		return "users/product";
	}

	@RequestMapping("change-pass")
	public String changePass(ModelMap md, HttpServletRequest request, @RequestParam String newpass,
			@RequestParam String renewpass, @RequestParam int maXacNhan) {
		HttpSession session = request.getSession();
		int ma = (int) session.getAttribute("ma");
		String username = (String) session.getAttribute("fogot-username");
		Users user = userDao.getUSER(username);
		if (newpass.equals(renewpass) && ma == maXacNhan) {
			user.setPassword(newpass);
			userDao.updateUser(user);
			return "redirect:/logout.htm";
		} else {
			md.addAttribute("changeErorr", "Mã xác nhận không chính xác hoặc mật khẩu không khớp!");
			return "change-pass";
		}

	}

	@RequestMapping("verify-change-pass")
	public String verifyChangePass() {
		return "users/change-pass";
	}

	@RequestMapping("send")
	public String send(ModelMap md, HttpSession session, @RequestParam String emailQMK) {
		String username = userDao.getUserName(emailQMK);
		if (username != null) {
			try {
				Random random = new Random();
				int ma = random.nextInt(99999) + 1;
				session.setAttribute("ma", ma);
				session.setAttribute("fogot-username", username);
				MimeMessage mail = mailer.createMimeMessage();
				MimeMessageHelper helper = new MimeMessageHelper(mail);
				helper.setFrom("kypham1894@gmail.com");
				helper.setTo(emailQMK);
				helper.setSubject("Mã xác nhận quên mật khẩu");
				helper.setText("Mã xác nhận của bạn là " + ma, true);
				mailer.send(mail);
				md.addAttribute("message", "Gửi email thành công!");
			} catch (Exception e) {
				md.addAttribute("message", "Gửi email thất bại!" + e);
			}
			return "redirect:/verify-change-pass.htm";
		} else {
			return "redirect:/logout.htm";
		}
	}

}
