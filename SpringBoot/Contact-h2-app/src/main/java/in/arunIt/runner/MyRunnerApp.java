package in.arunIt.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import in.arunIt.entity.Contact;
import in.arunIt.repo.ContactRepository;

@Component
public class MyRunnerApp implements ApplicationRunner {

	@Autowired
	private ContactRepository contactRepository;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Contact c1 = new Contact();
		c1.setName("Arun");
		c1.setPhono(9611446222d);
		
		Contact c2 = new Contact();
		c2.setName("ArunKumar");
		c2.setPhono(9611722260d);
		
		contactRepository.saveAll(Arrays.asList(c1,c2));
		
	}

}
