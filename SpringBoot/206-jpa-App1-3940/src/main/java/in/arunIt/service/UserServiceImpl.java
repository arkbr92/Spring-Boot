package in.arunIt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.arunIt.entity.User;
import in.arunIt.repo.UserRepository;
import in.arunIt.utils.EmailUtils;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;
	 
	@Autowired
	private EmailUtils emailUtils;
	
	
	@Override
	public boolean saveUser(User user) {
		User savedUser=userRepo.save(user);
		if(savedUser.getuId()!=null)
		{
			String subject ="Your Account Created Successfully";
			String body ="<h1>Congratulations, WelCome TO ArunIt </h1>";
			emailUtils.sendMail(user.getEmail(), subject, body);
		}
		return true;
	}

	@Override
	public User getUser(String email, String pwd) {
		
		return userRepo.findByEmailAndPwd(email, pwd);
	}

}
