
public class Prime_0to100 {

	public static void main(String[] args) {
		for(int no=1;no<=100;no++)
		{
			int temp=0;
			for(int i=2;i<=no-1;i++)
			{
			   if(no%i==0)    //reminder
			   {
				temp=temp+1;
			   }
			}
			if(temp==0)
			{
				System.out.println(no);
			}
			
		}

	}

}
