import java.util.Scanner;

public class Digit {
	public int checkDigit(int no)
	{
		int count=0;
		while(no>0) {
		int rem=no%10;
		count++;
		no=no/10;
		}
		return 0;
	}
	
	public int power(int power,int base)
	{
		int ans=1;
		for(;power>0;power--)
		{
			ans=ans*base;
		}
	return 0;
    }

	public static void main(String[] args) {
		Digit obj=new Digit();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No");
		int no=sc.nextInt();
		int ans=obj.checkDigit(no);
		System.out.println(ans);
		int answer=obj.power(3, 2);
		System.out.println(answer);
	
		

	}

}
