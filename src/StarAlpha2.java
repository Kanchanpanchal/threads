import java.util.Scanner;

public class StarAlpha2 {
	public void star()
	{
		char ch='a';
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
				ch++;
				
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		StarAlpha2 sa=new StarAlpha2();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No");
		char ch=sc.nextLine().charAt(0);
	
		sa.star();
		
		

	}

}
