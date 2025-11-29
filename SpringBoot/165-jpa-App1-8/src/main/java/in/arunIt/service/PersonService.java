package in.arunIt.service;

import java.time.LocalDate;

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
	
	public void savePerson() {
		
		Person p=new Person();
		p.setEname("RAM");
		p.setGender("Male");
		
		
		Passport pp= new Passport();
		pp.setPassportNum("JJ123KK");
		pp.setIssuedDate(LocalDate.now());
		pp.setExpiryDate(LocalDate.now().plusYears(10));
		
		p.setPassport(pp);
		pp.setPerson(p);
		
		personRepo.save(p);
		System.out.println("Person Details Saved Successfully.....!!!!!");
		
		
	}

}
