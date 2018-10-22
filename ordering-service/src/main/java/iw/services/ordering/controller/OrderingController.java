package iw.services.ordering.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderingController {

	@GetMapping("/")
	public String home(){
		return "home";
	}
}
