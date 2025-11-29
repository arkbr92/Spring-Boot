package in.arunIt.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.arunIt.binding.User;
import jakarta.validation.Valid;

@Controller
public class UserControllrer {
	
	
	@GetMapping("/user")
	public String loadform(Model model) {
		model.addAttribute("user", new User());
		return "index";
		
	}
	@PostMapping("/user")
	public String handleForm(@Valid User user,BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "index";
		}else {
			System.out.println(user);
			
			model.addAttribute("msg", "User Saved");
			
			return "index";
		}
		
	}
	

}
