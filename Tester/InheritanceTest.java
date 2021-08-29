package Tester;

public class InheritanceTest {
	public static void main(String[] args) {	
		Son1 S1=new Son1();
		S1.car();
		Doughter D=new Doughter();
		D.money();
		GrandChild G=new GrandChild();
		G.RE();
		Student S=new Student(2,"ABC");
	
	}
}

class Father1{
	void car() {
		System.out.println("This is Father's Car");
	}
	void money() {
		System.out.println("10,00,000");
	}
	private final void House(){
		System.out.println("Father's House");
	}
}

class Son1 extends Father1{
	void RE() {
		System.out.println("This is son's bike");
	}
}
class Doughter extends Father1{
	void house(){
		System.out.println("This is doughter's house");
	}
}

class GrandChild extends Son1{
	void job() {
		System.out.println("Grand child's Job");
	}
}
class Student{
	int  ID;
	String Name;
	Student(int a,String abc) {
		ID=a;
		Name="abc";
		System.out.println(ID + "\n"+Name);
	}
}
