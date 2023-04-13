package java_base;

public class Singleton {
	public static Singleton Instance = new Singleton();
	private Singleton() {}
	
	public void singleton(String msg) {
		System.out.println(msg);
	}
}
