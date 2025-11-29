package in.arunIt.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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
	
	public void callCustomQueries() {
		List<Employee> emps = empRepo.getAllEmpByHQL();
		emps.forEach(System.out::println);
	}
	public void callCustomQueriesById(Integer eid) {
		List<Employee> emps = empRepo.getEmpById(eid);
		emps.forEach(System.out::println);
		
	}
	
	public void callAllEmpsCustomQueries() {
		List<Employee> emps = empRepo.getAllEmps();
		emps.forEach(System.out::println);
	
	}
	
	
	
	
	public void callByMethod() {
		List<Employee> emps = empRepo.findByEname("Rakshith");
		emps.forEach(e -> System.out.println(e));
	}
	
	public void callBySalary() {
		List<Employee> emps = empRepo.findByEsalary(9000.00);
		emps.forEach(System.out::println);
		
	}
	
	public void callBySalaryGreaterThanEqual() {
		List<Employee> emps = empRepo.findByEsalaryGreaterThanEqual(9000.00);
		emps.forEach(System.out::println);
		
		
		
	}
	
	
	public void allEmps() {
		Iterable<Employee> emps = empRepo.findAll();
		emps.forEach(e ->System.out.println(e));
	}
	
	
	
	
	public void getEmps(List<Integer> eids) {
		Iterable<Employee> emps=empRepo.findAllById(eids);
		
		//emps.forEach(e ->System.out.println(e)); this is lambda expression
		emps.forEach(System.out::println);
		
		
	}
	
	
	
	
	
	
	
	public void getEmp(Integer eid) {
		
		Optional<Employee> findById=empRepo.findById(eid);
		if(findById.isPresent()) {
			Employee employee=findById.get();
			System.out.println(employee);
		}else {
			System.out.println("Record Not Found........!");
		}
	}
		public void allEmps(Integer eid) {
		
		Employee e1= new Employee(301,"Rahul",5000.00);
		Employee e2= new Employee(302,"Mahesh",8000.00);
		Employee e3= new Employee(303,"Kapil",9000.00);
		Employee e4= new Employee(304,"Lohit",10000.00);
		Employee e5= new Employee(305,"Rakshith",51000.00);
		
		List<Employee> emps=Arrays.asList(e1,e2,e3,e4,e5);
		empRepo.saveAll(emps);
		System.out.println("Records Saved................");
		
		
	}

}
