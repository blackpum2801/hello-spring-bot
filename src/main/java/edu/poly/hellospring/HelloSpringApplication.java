package edu.poly.hellospring;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}
}

@Controller
class HelloController {
	@GetMapping("/hello")
	public String hello() {
		return "hello"; // Trả về file hello.html trong thư mục templates
	}
}
