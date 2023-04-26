package JenkinsPipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@SpringBootApplication
public class JenkinsPipelineApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsPipelineApplication.class, args);
	}

	@GetMapping
	public String get() {
		return "Hello Jenkins!";
	}

}
