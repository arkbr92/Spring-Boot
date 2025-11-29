package in.arunIt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.arunIt.entity.Employee;

public interface EmpRepository extends CrudRepository<Employee, Integer>{
	
	@Query("from Employee")
	public  List<Employee> getAllEmpByHQL();
	
	@Query("from Employee where eid=:eid")
	public List<Employee> getEmpById(Integer eid);
	
	@Query(value="select * from Employee",nativeQuery = true)
	public  List<Employee> getAllEmps();
	
	
	public  List<Employee> findByEname(String ename);
	
	public List<Employee> findByEsalary(Double esalary);
	
	public List<Employee> findByEsalaryGreaterThanEqual(Double salary);

}
