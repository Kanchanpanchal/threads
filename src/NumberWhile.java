import java.util.Scanner;

public class NumberWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no,cont=0,rem;
		System.out.println("Enter Number");
		no=sc.nextInt();
		
	    while(no>0)
	    {
	    	rem=no%10;
	    	cont++;
	    	no=no/10;
	    }

	    System.out.println("No of Digits in Given Number:"+cont);
		
	}

}
