import java.util.Scanner;

public class GreadeEx {

	public static void main(String[] args) {
		int total;
		Scanner sc= new Scanner(System.in);
		System.out.println("sub1");
		int sub1=sc.nextInt();
		System.out.println("sub2");
		int sub2=sc.nextInt();
		System.out.println("sub3");
		int sub3=sc.nextInt();
		System.out.println("outof");
		int outof=sc.nextInt();
		
		total=sub1+sub2+sub3;
		int per=(total/outof)*100;
		
		
		{
		if(per>85)
		  System.out.println("A");
		else if(per>70 && per>=85)
			System.out.println("B");
		else if(per>50 && per>=70)
			System.out.println("B");
		else
			System.out.println("Failed");
		

	}

   }
}
