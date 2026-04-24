package creational.builder;

public class User {
	
	private String name;
	private String id;
	private int age;
	private String email;
	private String address;
	private int mobileNo;
	
	public User(UserBuilder builder) {
		this.name=builder.name;
		this.id=builder.id;
		this.age=builder.age;
		this.email=builder.email;
		this.address=builder.address;
		this.mobileNo=builder.mobileNo;
	}
	
	public static class UserBuilder{
		
		private String name;
		private String id;
		private int age;
		private String email;
		private String address;
		private int mobileNo;
		
		public UserBuilder(String id, String name){
			this.id=id;
			this.name=name;
		}
		
		public UserBuilder email(String email) {
			this.email=email;
			return this;
		}
		
		public UserBuilder address(String address) {
			this.address = address;
			return this;
		}
		
		public UserBuilder age(int age) {
			this.age=age;
			return this;
		}
		
		public UserBuilder mobileNo(int mobileNo) {
			this.mobileNo=mobileNo;
			return this;
		}
		
		public User build() {
			return new User(this);
		}
		
	}
	
	public String toString() {
		return "Name :: "+name+", "+"id :: "+id+", "+
				"email :: "+email+", "+
				"age :: "+age+", "+
				"mobileNo :: "+mobileNo+", "+
				"address :: "+address;
	}
}
