package Tester;

public class TryCatch {

	public static void main(String[] args) {
		System.out.println("Exception Handling");
		try{
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println(c);
		}catch(Exception e){
			System.out.println("Something went wrong");
		}finally {
			System.out.println("Try catch block is finished");
		}

	}

}
