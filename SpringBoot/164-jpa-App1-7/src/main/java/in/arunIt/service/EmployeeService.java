package in.arunIt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.arunIt.entity.Address;
import in.arunIt.entity.Employee;
import in.arunIt.repo.AddressRepository;
import in.arunIt.repo.EmployeeRepository;
import jakarta.transaction.Transactional;
@Service
public class EmployeeService {
	
	
	@Autowired
	private EmployeeRepository empRepo;
	@Autowired
	private AddressRepository  addressRepo;
	
	@Transactional(rollbackOn = Exception.class)
	public void saveEmp() {
		
		Employee e=new Employee();
		e.setEname("ARUN");
		e.setEsalary(11000.00);
		
		Employee saveEmp = empRepo.save(e);
		System.out.println(saveEmp);
		
		
		 //int i=10/0;
		
		Address a= new Address();
		a.setCity("HOCHIHALLI");
		a.setState("KARNATAKA");
		a.setCountry("India");
		a.setEid(saveEmp.getEid());
		Address saveAddr = addressRepo.save(a);
	
		
	}

}
