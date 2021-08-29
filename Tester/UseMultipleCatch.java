package Tester;

public class UseMultipleCatch {
	public static void main(String[] args) {
		 try{    
            int a[]=new int[5];    
            a[5]=30/0;    
           }    
           catch(ArithmeticException e)  
              {  
               System.out.println("Arithmetic Exception");  
               System.out.println(e);
              }    
		  	catch(ArrayIndexOutOfBoundsException e)  
		 	{  
		  		System.out.println("ArrayIndexOutOfBounds Exception");  
		 	}    
		 	catch(Exception e)  
		 	{				  
		 		System.out.println("Parent Exception");  
		 	}             
		 	System.out.println("rest of the code");    
	}  
}