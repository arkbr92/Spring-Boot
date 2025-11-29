package in.arunIt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.arunIt.PersonRepository;
import in.arunIt.entity.Person;
import in.arunIt.entity.PersonPK;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepository;
	
	
	public void getPerson() {
		PersonPK pks=new PersonPK();
		pks.setPersonId(101);
		pks.setPassportNum("kv12ec016");
		
		Optional<Person> findById=personRepository.findById(pks);
		if(findById.isPresent()) {
			Person person = findById.get();
			System.out.println(person);
		
		
			
		}else
		{
			System.out.println("Record Not Found......!!!!!!!!!!");
		}
	}
	
	public void savePerson() {
		PersonPK pks=new PersonPK();
		pks.setPersonId(101);
		pks.setPassportNum("kv12ec016");
		
		Person p=new Person();
		p.setName("Arun");
		p.setEmail("arunbr@gmail.com");
		p.setGender("Male");
		p.setPersonpk(pks);
		
		personRepository.save(p);
		System.out.println("Person Details Saved Successfully.....!!!!!");
	}
	

}
