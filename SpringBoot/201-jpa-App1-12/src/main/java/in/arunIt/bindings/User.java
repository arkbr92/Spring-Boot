package in.arunIt.bindings;

public class User {
	private String name;
	private String email;
	private Long phoneNum;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(Long phoneNum) {
		this.phoneNum = phoneNum;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", phoneNum=" + phoneNum + "]";
	}
	

}
