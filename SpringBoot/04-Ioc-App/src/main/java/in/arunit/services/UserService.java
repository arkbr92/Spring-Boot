package in.arunit.services;



import in.arunit.dao.Iuser;
import in.arunit.services.IuserServices;


public class UserService implements IuserServices {
	
	private Iuser userDao;
	
	public UserService() {
		System.out.println("UserServiceImpl:: 0-param :: Constructor");
	}
	
	public UserService(Iuser userDao) {
		System.out.println("UserServiceImpl:: param :: Constructor");
		this.userDao = userDao;
	}

	public String getName(int id) {
		return userDao.findName(id);
	}

}