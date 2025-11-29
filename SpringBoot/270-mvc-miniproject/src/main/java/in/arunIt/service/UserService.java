package in.arunIt.service;

import in.arunIt.entity.User;

public interface UserService {
	
	public boolean saveUser(User user);
	public User getUser(String email, String pwd);

}
