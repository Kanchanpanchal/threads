import java.util.Scanner;

public class IfLoop {
	public void myTask()
	{
		outerloop :
		for(int j=1;j<=3;j++)
		{
		 System.out.println("Task "+j);
		
		    innerloop :
			for(int i=1;i<=3;i++)
		    {
				if(i==2)
					continue outerloop;
			System.out.println("Hello "+i);
		    }
		 System.out.println("_______________________");
		}
		 	
		
	}

	public static void main(String[] args) {
		IfLoop obj=new IfLoop();
		Scanner sc=new Scanner(System.in);
		obj.myTask();

	}

}
