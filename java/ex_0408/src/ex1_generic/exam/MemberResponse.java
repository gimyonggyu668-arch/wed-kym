package ex1_generic.exam;



public class MemberResponse<T>{
	private boolean success;
	private String message;
	private T data;
	
	public MemberResponse(boolean success, String message, T data) {
		this.success = success;
		this.data = data;
		this.message = message;
	}
	
	public boolean isSuccess() {
		 return success;
	}
	public T getData() {
		return data;
	}
	public String getMessage() {
		return message;
	}
	
	
}
