package creational.singleton;

public class Singleton2 {
	
	private Singleton2() {}
	private static class Holder{		
		private static final Singleton2 INSTANCE = new Singleton2();
	}
	
	public Singleton2 getInstance(){
		return Holder.INSTANCE;		
	}
}