import java.util.Scanner;

public class StarAlpha3 {
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
		StarAlpha3 sa=new StarAlpha3();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No");
		char ch=sc.nextLine().charAt(0);
	
		sa.star();
		
		

	}

}
