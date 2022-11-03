import java.util.Scanner;

public class WhileLoopTable {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int t,s=0,n=1;
		System.out.println("Enter Number You want to Table:");
		t=sc.nextInt();
		while(n>=10)
			{
			s=t*n;
			System.out.println("Table is:"+s);
			t++;
		}
		

	}

}
