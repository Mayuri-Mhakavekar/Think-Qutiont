package Tester;

public class Constractor {

	public static void main(String[] args) {
		BankAccount1 B=new BankAccount1(123456 , "Mayuri");

	}

}
class BankAccount1{
	int AccountNo;
	String Name;
	
	BankAccount1(int n, String m){
		System.out.println("Account Number:"+AccountNo);
		System.out.println("Account Holder Name:"+Name);
	}
}