package ohkod.fr.ampermetre.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class TestApiOhkod {

	@GetMapping(value = "/hello")
	public String getMethodeName() {
		return "java spring boot sur ohkod.fr";
 
	}

	public static void main(String[] args) {
		SpringApplication.run(TestApiOhkod.class, args);
    }

}
