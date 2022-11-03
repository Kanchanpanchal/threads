import java.util.Scanner;

public class ContinueTable {
	public int table(int n)
	{
		int i;
		for( i=1;i<=10;i++)
		{
			if(i==5)
				continue;
		System.out.println(n +"*" +i+"="+n*i);
		}
		return 0;
	}

	public static void main(String[] args) {
		ContinueTable obj=new ContinueTable();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Interger");
		int n=sc.nextInt();
		
		obj.table(n);
		
	}

}
