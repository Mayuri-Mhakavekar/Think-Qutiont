package Tester;

public class Overrinding {
	public static void main(String[] args) {
		B aa=new B();
		aa.Massage();

	}

}
class A{
	void Massage() {
		System.out.println("Welcome to base class");
	}
}
class B extends A{
	void Massage() {
		System.out.println("Welcome to derivied class");
	}
}
