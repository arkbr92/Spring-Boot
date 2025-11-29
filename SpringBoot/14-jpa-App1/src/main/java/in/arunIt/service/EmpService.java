package in.arunIt.service;

import org.springframework.stereotype.Service;

import in.arunIt.entity.Employee;
import in.arunIt.repo.EmpRepository;

@Service
public class EmpService {
	
	
	private EmpRepository empRepo;
	
	public EmpService(EmpRepository empRepo) {
		// TODO Auto-generated constructor stub
		this.empRepo=empRepo;
	}
	
	
	public void saveEmployee() {
		
		System.out.println("impl class::"+empRepo.getClass().getName());
		
		Employee e=new Employee();
		e.setEid(104);
		e.setEname("Arunkumar B R");
		e.setEsalary(69000.30);
		
		
		empRepo.save(e);
		
		System.out.println("Record Saved.........");
		
	}
	
	

}
