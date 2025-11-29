package in.arunIt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.arunIt.entity.Person;
import in.arunIt.entity.PersonPk;
import in.arunIt.repo.PersonRepository;

@Service
public class PersonService {
	@Autowired
	private PersonRepository personRepository;
	
	public void getPerson() {
		
		PersonPk pks=new PersonPk();
		pks.setPersonId(101);
		pks.setPassportNum("4kv12ec016");
		
		
	
		Person p=new Person();
		p.setName("Arun");
		p.setEmail("arunbr@gmail.com");
		p.setGender("Male");
		
		p.setPersonPk(pks);
		
		personRepository.save(p);
		System.out.println("Person Saved Successfully......!!!!!");
		
	}
	

}
