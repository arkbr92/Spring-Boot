package in.arunIt;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.arunIt.service.EmpService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		EmpService empService = context.getBean(EmpService.class);
		//empService.allEmps(Arrays.asList(201,301,304));
		//empService.allEmps();
		//empService.callByMethod();
		//empService.callBySalary();
		
		//empService.callBySalaryGreaterThanEqual();
		//empService.callCustomQueries();
		//empService.callCustomQueriesById(303);
		empService.callAllEmpsCustomQueries();
	}

}
