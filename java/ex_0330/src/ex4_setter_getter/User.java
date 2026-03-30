package ex4_setter_getter;

public class User {
	private String username;
	private String password;
	
	
	public void setUserName(String username) {
		if(4 >= username.length() ) {
			System.out.println("아이디는 4글자 이상이어야 합니다.");
			
		}else {
			this.username = username;
			
		}
	}
	
	public void setPassword(String password) {
		if(6 >= password.length() ) {
			System.out.println("비밀번호는 6글자 이상이어야 합니다.");
		}else {
			this.password = password;
		}
		
	}
	
	public String getUserName() {
		return this.username;
	}
	
	public String getPassword() {
		return this.password;
	}
	public void userInfo() {
	System.out.println(getUserName());
	System.out.println(getPassword());
	}
	
	
}
