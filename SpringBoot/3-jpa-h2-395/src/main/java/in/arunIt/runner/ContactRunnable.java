package in.arunIt.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import in.arunIt.entity.Contact;
import in.arunIt.repo.ContactRepository;

@Component
public class ContactRunnable implements ApplicationRunner {
	
	@Autowired
	private ContactRepository repo;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		Contact c1=new Contact();
		
		c1.setName("Arun");
		c1.setPhNum(1234567880l);
		
		Contact c2=new Contact();
		c2.setName("Varun");
		c2.setPhNum(12355567880l);
		
		
		repo.saveAll(Arrays.asList(c1,c2));
	}
	
	

}
