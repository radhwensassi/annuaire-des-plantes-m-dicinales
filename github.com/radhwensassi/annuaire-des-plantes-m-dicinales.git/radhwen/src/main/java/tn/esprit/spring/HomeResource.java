package tn.esprit.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

	
		@GetMapping("/")
		public String Home () {
			return ("<h1>Welcome<h1>");
		}
}
