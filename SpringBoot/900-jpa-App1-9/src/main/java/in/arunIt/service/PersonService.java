package in.arunIt.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.arunIt.entity.Passport;
import in.arunIt.entity.Person;
import in.arunIt.repo.PassportRepository;
import in.arunIt.repo.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepo;
	@Autowired
	private PassportRepository passportRepo;
	
	public void getPerson( ) {
		/*Person p=new Person();
		 p.setPname("Ram");
		 p.setGender("Male"); */
		Optional<Person> findById = personRepo.findById(1);
		/**/if(findById.isPresent()) {
			Person person = findById.get();
			
			System.out.println(person.getPid());		}
	};
	
	public void getPassport( ) {
		
		
	Optional<Passport> findById=passportRepo.findById(1);
	
	
	}
	
	public void savePerson() {
		 Person p=new Person();
		 p.setPname("Ram");
		 p.setGender("Male");
		 
		 
		 Passport pp=new Passport();
		 pp.setPassportNum("JJ124KK");
		 pp.setIssuedDate(LocalDate.now());
		 pp.setExpiryDate(LocalDate.now().plusYears(10));
		  
		 p.setPassport(pp);
		 pp.setPerson(p);
		 
		 personRepo.save(p);
		 System.out.println("Person Details Saved Successfully.....!!!!!");
	
		 
	}

}
