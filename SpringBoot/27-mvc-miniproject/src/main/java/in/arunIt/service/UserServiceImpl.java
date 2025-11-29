package in.arunIt.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.arunIt.repo.UserRepository;
import in.arunIt.utils.EmailUtils;
import in.arunIt.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private EmailUtils emailutils;

	@Override
	public boolean saveUser(org.apache.catalina.User user) {
		org.apache.catalina.User saveedUser = userRepository.save(user);
		if(saveedUser.get)
		return false;
	}

	@Override
	public org.apache.catalina.User getUser(String eMail, String pwd) {
		// TODO Auto-generated method stub
		return null;
	}

	

}