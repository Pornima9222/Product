package in.ashokit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {
@GetMapping("/Product")
	public String getProduct() {
		return "Thank You For Choosing Us";
	}
}