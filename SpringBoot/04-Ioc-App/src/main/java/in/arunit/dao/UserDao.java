package in.arunit.dao;

public class UserDao implements Iuser {

	public UserDao() {
		System.out.println("UserDaoImpl::Constructor");
	}

	
	
	public String findName(int id) {
		if(id==100) {
		return "Raju";
	}else if(id==101){
		return "Rani";
	}
		return null;

}
}