package in.arunIt.rest;

import org.springframework.web.bind.annotation.GetMapping;

public class WelcomeRestController {

	@GetMapping("/welcome")
	public String welcomeMsg() {
		String msg="Welcome To Ashoka IT";
		return msg;
	}
}
