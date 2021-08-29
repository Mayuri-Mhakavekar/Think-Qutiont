package Tester;

public class FinallyKeyward {
	public static void main(String[] args) {
		try {
			int a=100;
			int b=0;
			System.out.println(a/b);
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			System.out.println("Thank you for banking with us...Have a great day");
		}

	}

}
