import java.util.Scanner;

public class Gretestno {
	public int checkGretest(int a,int b,int c,int d)
	{
		{
		if(a>b && a>c && a>d)
			System.out.println(a+"is Greater");
		else if(b>a && b>c && b>d)
			System.out.println(b+"is Greater");
		else if(c>a && c>b && c>d)
			System.out.println(c+"is Greater");
		else
			System.out.println(d+"is Greater");
	
		}	
	
	return 0;
	}


	public static void main(String[] args)
	{
	Gretestno obj=new Gretestno();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter No 1:");
	int no1=sc.nextInt();
	System.out.println("Enter No 2:");
	int no2=sc.nextInt();
	System.out.println("Enter No 3:");
	int no3=sc.nextInt();
	System.out.println("Enter No 4:");
	int no4=sc.nextInt();
	
	obj.checkGretest(no1, no2, no3, no4);
	

	}
  }

