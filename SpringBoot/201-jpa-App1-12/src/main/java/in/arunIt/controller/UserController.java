package in.arunIt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.arunIt.bindings.User;

@Controller
public class UserController {
	
	@GetMapping("/user")
	public ModelAndView getUser() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("userObject",new User());
		mav.setViewName("index");
		return mav;
	}
		
		@PostMapping("/user")
		public ModelAndView postUser(User user) {
			System.out.println(user);
			ModelAndView mav=new ModelAndView();
			mav.addObject("msg","User Details Saved...!!!");
			mav.setViewName("success");
			
			return mav;
		
		
	}

}
