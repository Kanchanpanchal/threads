import java.util.Scanner;

public class Fibbonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int no=sc.nextInt();
		int a=0,b=1;
		System.out.print(a+" "+b);
		int c;
		for(int i=1;i<=no;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	

	}

}
