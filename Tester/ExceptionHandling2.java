package Tester;
import java.util.Arrays;
public class ExceptionHandling2 {
	public static void main(String[] args) {
		String s="Mayuri";
		System.out.println(s);
		
		try {
			int a=100/0;
			System.out.println(a);
		}
		catch(ArithmeticException q) {
			System.out.println(q);
		}
		int b=190+36;
		System.out.println(b);

	}
/*	public static void main(String[] args) {
		String ptr=null;
		try {
			if(ptr = "pgp")
			{
				System.out.println("Same");
			}
			else
			{
				System.out.println("Never");
			}
		}
		catch(NullPointerException e){
			System.out.println(e);
		}
	}*/

}
