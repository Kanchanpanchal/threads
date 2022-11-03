import java.util.Scanner;

public class Star2 {
	public void pattern()
	{
		for(int i=1;i<=4;i++)    //row
		{
			for(int j=1;j<=i;j++)       //Column
			{
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		Star2 obj=new Star2();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int no=sc.nextInt();
		obj.pattern();

	}

}
