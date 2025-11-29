package in.arunIt.contoller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.ui.Model;
import in.arunIt.entity.User;
import in.arunIt.service.UserService;


@Controller
public class UserController  {
	@Autowired
	private UserService userService;
	
	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("user", new User());
		
		return "index";
	}
	
	
	@PostMapping("/login")
	public String handleLogin(User user, Model model) {
		User userObj = userService.getUser(user.getEmail(), user.getPwd());
		if(userObj==null) {
			model.addAttribute("emsg", "invalid Credentials");
			return "index";
			
		}else {
			model.addAttribute("msg", userObj.getName()+",WelCome ToArunIt");
		}
		return "dashboard";
		
	}
	
	
	
	@GetMapping("/register")
	public String register(Model model) {
		model.addAttribute("user", new User());
		return "registerView";
	}
	
	
	@PostMapping("/register")
	public String handleregister(User user,Model model) {
		boolean status = userService.saveUser(user);
		if(status) {
			model.addAttribute("smsg", "User Registerd");
			
			
		}else {
			model.addAttribute("emsg", "Registration Failed");
		}
		return "registerView";
		
	}
	@GetMapping("/logout")
	public String logout(Model model) {
		model.addAttribute("user", new User());
		return "index";
		
	}
	
}
