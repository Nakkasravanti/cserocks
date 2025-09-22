package com.example.csejenkins1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
@GetMapping("/cserocks")
public String cse() {
	return "welcome to ACET jenkins";
}
}
