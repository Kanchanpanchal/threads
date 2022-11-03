import java.util.Scanner;

public class IncreasingNo {
	boolean isIncreasing(int no)
	{
		boolean flag=true;
		int r1=no%10;
		no=no/10;
		while(no>0)
		{
			int r2=no%10;
			if(r1<r2)
			{
				flag=true;
				break;
			}
			r1=r2;
			no=no/10;
		}
		return true;
	}

	public static void main(String[] args) {
		IncreasingNo obj=new IncreasingNo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No");
		int no=sc.nextInt();
		//boolean ans=obj.isIncreasing(no);
		//System.out.println(ans);
		System.out.println("No is Increasing "+obj.isIncreasing(no));
        
		
	}

}
