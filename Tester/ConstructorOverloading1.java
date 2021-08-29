package Tester;

public class ConstructorOverloading1 {
	public static void main(String[] args) {
		std S=new std(102);
		std S1=new std("Mayuri","Kolhapur");
		S.display();
		S1.display();
	}
}
class std{
	int ID;
	String Name;
	String Address;
	
	std(int i){
		ID=i;
	}
	
	std(String n,String m){
	Name=n;
	Address=m;
	}
	void display() {
		System.out.println(ID);
		System.out.println(Name+"\n "+Address);
	}
}
