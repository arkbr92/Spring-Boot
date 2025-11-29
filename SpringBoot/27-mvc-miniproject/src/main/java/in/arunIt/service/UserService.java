package in.arunIt.service;

import org.apache.catalina.User;

public interface UserService {
	
	public boolean saveUser(User user);
	public User getUser(String eMail, String pwd);

}
