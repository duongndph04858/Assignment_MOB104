package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dao.USER_DAO;
import entity.USERS;

@Controller
public class Authentication_Controller {
	@Autowired
	USER_DAO user_dao;

	@RequestMapping("login")
	public String login(HttpSession session, @RequestParam("username") String username,
			@RequestParam("password") String password, ModelMap md) {
		USERS user = user_dao.getAccount(username);
		if (user != null) {
			if (user.getPassword().equals(password)) {
				System.out.println(user.getFullname());
				session.setAttribute("user", user.getFullname());

			} else {
				md.addAttribute("login-error", "Mật khẩu bạn nhập không chính xác!");
			}
		} else {
			md.addAttribute("login-error", "Tài khoản không tồn tại!");

		}
		return "redirect:/home.htm";

	}

	@RequestMapping(value = "logout", params = "yes")
	public String logout(HttpSession session, HttpServletRequest request) {
		session = request.getSession();
		session.invalidate();
		return "redirect:/home.htm";
	}

	@RequestMapping(value = "logout", params = "no")
	public String dont_logout() {
		return "redirect:/home.htm";
	}

	@RequestMapping("register")
	public String register(HttpServletRequest request,
			@RequestParam(value = "register-username", required = true, defaultValue = "") String username,
			@RequestParam(value = "register-password", required = true, defaultValue = "") String password,
			@RequestParam(value = "register-repassword", required = true, defaultValue = "") String repassword,
			@RequestParam(value = "register-email", required = true, defaultValue = "") String email, ModelMap md) {
		if (username.isEmpty() || password.isEmpty() || repassword.isEmpty() || email.isEmpty()) {
			md.addAttribute("reg-error", "Vui lòng nhập đủ các trường!");
		} else if (password.equals(repassword)) {
			try {
				user_dao.insertUser(new USERS(username, password, email));
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			md.addAttribute("reg-error", "Đã xảy ra lỗi trong quá trình đăng ký tài khoản!");
		}
		return "redirect:/home.htm";
	}

}
