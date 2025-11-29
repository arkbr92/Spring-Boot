package in.arunIt.service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.arunIt.entity.Address;
import in.arunIt.entity.Employee;
import in.arunIt.repo.AddressRepository;
import in.arunIt.repo.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepo;
	@Autowired
	private AddressRepository addressRepo;
	
	
	public void deletePerson() {
		addressRepo.deleteById(3 );
	}
	
	
	public void getPerson() {
		 Optional<Employee> findById = empRepo.findById(2);
		 if(findById.isPresent()) {
			 Employee employee = findById.get();
			 List<Address> addressLis = employee.getAddressList();
			 System.out.println(addressLis);
		 }
	}
	
	public void savePerson() {
		 Employee e=new Employee();
		 e.setEname("Krishna");
		 e.setSalary(111000.00);
		 
		 
		 Address a1=new Address();
		 a1.setCity("Hochihalli");
		 a1.setState("Karnataka");
		 a1.setCountry("India");
		 a1.setType("Permanent");
		 
		 
		 Address a2=new Address();
		 a2.setCity("Sullia");
		 a2.setState("Karnataka");
		 a2.setCountry("India");
		 a2.setType("Present");
		 //association
		 List<Address> asList = Arrays.asList(a1,a2);
		 a1.setEmployee(e);
		 a2.setEmployee(e);
		 e.setAddressList(asList);
		 
		 empRepo.save(e);
		
	}

}
