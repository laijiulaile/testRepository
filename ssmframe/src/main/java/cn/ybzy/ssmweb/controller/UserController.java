package cn.ybzy.ssmweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.ybzy.ssmweb.model.User;
import cn.ybzy.ssmweb.service.UserService;

@Controller
public class UserController {
 
	@Autowired
    private	UserService userService;
	
	@RequestMapping("/")
	public String login(Model model) {
		
		List<User> users = userService.selectAllUsers();
		model.addAttribute("users", users);
		return "index";
	}
	
}
