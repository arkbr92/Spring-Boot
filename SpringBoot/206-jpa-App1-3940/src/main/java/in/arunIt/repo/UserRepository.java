package in.arunIt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.arunIt.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	public User findByEmailAndPwd(String email, String pwd);
	

}
