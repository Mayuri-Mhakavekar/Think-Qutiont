package Tester;

public class Overloading {
	public static void main(String[] args) {
		Bank B=new Bank();
		B.AccountName(20);

	}

}
class Bank{
	int name;
	void AccountName(int a) {
		name=a;
		System.out.println("Account Name");
	}
	void AccountName() {
		System.out.println("Account Number");
	}
}
