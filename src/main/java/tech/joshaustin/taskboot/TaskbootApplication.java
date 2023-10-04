package tech.joshaustin.taskboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "tech.joshaustin.taskboot")
public class TaskbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskbootApplication.class, args);
	}

}
