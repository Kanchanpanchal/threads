import java.util.Scanner;

public class StarAplabet1 {
	public void pattern()
	{
		char ch='a';
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
	
				System.out.print(ch+" ");
				System.out.println(" ");
			    ch++;

	}
}
	public static void main(String[] args) {
		StarAplabet1 obj=new StarAplabet1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		char ch=sc.nextLine().charAt(0);
		obj.pattern();

	}

}
