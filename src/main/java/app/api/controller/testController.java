package app.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class testController {

	@GetMapping("/status")
	public String testApi() {
		return "Status v3 - returned by Pod";
	}
}
