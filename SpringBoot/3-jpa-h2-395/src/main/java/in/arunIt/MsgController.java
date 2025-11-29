package in.arunIt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class MsgController {
	
	@GetMapping("/greet")
	public String greetMsg(Model model) {
		model.addAttribute("msg", "Hi !!!hello..");
		
		
		return "index";
	}
	
	
	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg() {
		String msgText="HI...Good Morning";
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg",msgText);
		mav.setViewName("index");
		return mav;
	}

}
