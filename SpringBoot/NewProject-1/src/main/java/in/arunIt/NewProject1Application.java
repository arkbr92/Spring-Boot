package in.arunIt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class NewProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(NewProject1Application.class, args);
	}

}
