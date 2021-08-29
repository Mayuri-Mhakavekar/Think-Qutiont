package Tester;

public class learnStatic {

	
	static int age;
	static String name;
	
	static void disp() {
		System.out.println("Age is :"+age);
		System.out.println("name is :"+name);
	}
	
	public static void main(String[] args) {
		age=30;
		name="Mayuri";
		disp();
	}
}

