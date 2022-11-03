import java.util.Scanner;
public class Person {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age:");
		int age=sc.nextInt();
		
		if(age>=0 && age<=100)
		{
			if(age>=18)
				System.out.println(" Congradulations!...Please open Your Bank Account");
			else 
				System.out.println("Not able to open account");
		}
		
		else 
		{
			System.out.println("Invalid Age");
       }			

	}

}
