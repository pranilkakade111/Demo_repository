import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExceptionDemo
{
   int bal=5000;
   int amt=0;
   Scanner sc=new Scanner(System.in);
   
   public void withdraw()
   {
	   System.out.println("Enter the amount");
	   amt=sc.nextInt();
	   if(amt>bal)
	   {
		   try 
		   {
			throw new InsufficientException();
		   } 
		   catch (InsufficientException e) 
		   {
			e.printStackTrace();
		   }
	   }
		   else
		   {
			  bal=bal-amt;
			  System.out.println("your current balance is=" +bal);
		   }
   }
	public static void main(String[] args) 
	{
		ExceptionDemo ba=new ExceptionDemo();
		ba.withdraw();
		
	}

}
class InsufficientException extends Exception
{
	public String toString() 
	{
		
	return "InsufficientBalance";
	}
	
}
