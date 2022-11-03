import java.util.Scanner;

public class Star1 {
	public void pattern()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		Star1 obj=new Star1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int no=sc.nextInt();
		obj.pattern();

	}

}
