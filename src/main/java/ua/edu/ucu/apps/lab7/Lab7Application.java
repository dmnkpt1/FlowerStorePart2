package ua.edu.ucu.apps.lab7;

import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Lab7Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab7Application.class, args);
	}


	// @RequestMapping(method = RequestMethod.GET, path = "/list")
	@GetMapping("/list")
	public List<String> getRandomUUIDs() {
		return Stream.generate(() -> UUID.randomUUID())
		.map(UUID::toString)
		.limit(10)
		.toList();
	}

}
