package in.arunIt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.arunIt.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	public User findByEmailAndpwd(String email,String pwd);

}
