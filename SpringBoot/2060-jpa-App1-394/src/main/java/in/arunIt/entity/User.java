package in.arunIt.entity;

public class User {
	
	private Integer uId;
	private String name;
	private String email;
	private String pwd;
	private Long phneNumb;
	public Integer getuId() {
		return uId;
	}
	public void setuId(Integer uId) {
		this.uId = uId;
	}
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
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Long getPhneNumb() {
		return phneNumb;
	}
	public void setPhneNumb(Long phneNumb) {
		this.phneNumb = phneNumb;
	}
	@Override
	public String toString() {
		return "User [uId=" + uId + ", name=" + name + ", email=" + email + ", pwd=" + pwd + ", phneNumb=" + phneNumb
				+ "]";
	}
	
	

}
