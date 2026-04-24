package creational.builder;

public class BuilderPatternTest {
	public static void main(String[] args) {
		User user = new User.UserBuilder("Guru","145267").
				email("guru_234@gmail.com").
				address("HRT layout").
				age(50).
				mobileNo(234789222).
				build();
		System.out.println(user.toString());
	}
}