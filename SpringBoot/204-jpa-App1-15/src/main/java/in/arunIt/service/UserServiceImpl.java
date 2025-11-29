package in.arunIt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.arunIt.entity.User;
import in.arunIt.repo.UserRepository;
import in.arunIt.utils.EmailUtils;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private EmailUtils emailUtils;
	
	@Override
	public boolean saveUsera(User user) {
		User savedUser = userRepository.save(user);
		if(savedUser.getuId()!=null) {
			String subject="Your Account Created";
			String body="Congratulations,Welcome to ArunIt ";
			emailUtils.sendEmail(user.getEmail(), subject,body);
			
		}
		return true;
	}

	@Override
	public User getUser(String email, String pwd) {
		
		return userRepository.findByEmailAndpwd(email, pwd);
	}

}
