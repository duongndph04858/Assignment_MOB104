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
	public String login(HttpSession session ,@RequestParam("username") String username,@RequestParam("password") String password,ModelMap md) {
			USERS user = user_dao.getAccount(username);
		if(user.getPassword().equals(password)) {
				System.out.println(user.getFullname());
				session.setAttribute("user",user.getFullname());
				return "redirect:/home.htm";
		}else {
			return "redirect:/iphone.htm";
		}
		
	}
	
	@RequestMapping(value="logout",params="yes")
	public String logout(HttpSession session,HttpServletRequest request) {
		session = request.getSession();
		session.invalidate();
		return "redirect:/home.htm";
	}
	@RequestMapping(value="logout",params="no")
	public String dont_logout(HttpSession session,HttpServletRequest request) {
		return "redirect:/home.htm";
	}
}
