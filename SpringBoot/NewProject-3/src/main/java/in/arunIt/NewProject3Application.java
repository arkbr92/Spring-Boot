package in.arunIt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NewProject3Application {

	public static void main(String[] args) {
		SpringApplication.run(NewProject3Application.class, args);
	}

}
