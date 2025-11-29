package in.arunIt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroProjectApplication.class, args);
	}

}
