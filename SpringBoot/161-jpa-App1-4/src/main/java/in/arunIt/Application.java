package in.arunIt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.arunIt.repo.ProductRepository;
import in.arunIt.service.ProductService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	
		ProductService bean = context.getBean(ProductService.class);
		bean.saveAllProducts();
	}

}
