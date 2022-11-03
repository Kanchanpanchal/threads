import java.util.Scanner;

public class Star4 {
	public void pattern()
	{
		int no=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(no+" ");
				no++;
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		Star4 obj=new Star4();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int no=sc.nextInt();
		obj.pattern();

	}

}
