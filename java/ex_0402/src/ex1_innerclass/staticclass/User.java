package ex1_innerclass.staticclass;

//Builder 패턴
//객체를 만들 때 생성과정을 단계적으로 분히라는 설계 방식
public class User {
	String id;

	String name;

	private User(Builder builder) {

		this.name = name;

		this.id = id;

	}

	// 객체 생성 책임 분리
	// Builder가 값을 하나씩 모으고
	// 마지막에 build()메서드를 통해서 실제 객체를 만드는 방식
	public static class Builder {
		private String id;

		private String name;

		public Builder id(String id) {
			this.id = id;
			return this;// 현재 Builder 객체를 그대로 반환
		}

		public Builder name(String name) {
			this.name = name;
			return this;// 현재 Builder 객체를 그대로 반환

		}

		public User build() {
			// this -> Builder 객체
			return new User(this);
		}

	}
}
