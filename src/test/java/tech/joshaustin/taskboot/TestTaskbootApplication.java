package tech.joshaustin.taskboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.devtools.restart.RestartScope;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.testcontainers.containers.PostgreSQLContainer;

@Configuration
class TestTaskbootApplication {

	@Bean
	@RestartScope
	@ServiceConnection
	PostgreSQLContainer postgreSQLContainer() {
		return new PostgreSQLContainer("postgres:15.1-alpine");
	}

	public static void main(String[] args) {
		SpringApplication
				.from(TaskbootApplication::main)
				.with(TestTaskbootApplication.class)
				.run(args);
	}

}
