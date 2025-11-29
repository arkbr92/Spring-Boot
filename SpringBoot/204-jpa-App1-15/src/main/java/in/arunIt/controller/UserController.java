package in.arunIt.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


import in.arunIt.entity.User;
import in.arunIt.service.UserService;
import jakarta.persistence.Index;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("user",new User());
		
		return "index";
		
	}
	
	@PostMapping("/login")
	public String handleLogin(User user, Model model) {
		User userObj=(User) model.addAttribute(user.getEmail(), user.getPwd());
		if(userObj==null) {
			model.addAttribute("emsg", "Invalid User");
			return "index";
		}
		else {
			model.addAttribute("smsg", userObj.getName()+"Welcome to ArunIt");
			
		}
		return "dashboard";
		
	}

}
