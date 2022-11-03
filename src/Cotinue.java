
public class Cotinue {

	public static void main(String[] args) {
/*		int i=1;
		while(i<=10)
		{
			if(i!=6)       //skip it 6 and continue to the next iteration.
				System.out.println("i="+i);
			i++;
		}

	}
*/
	// Another way to use Continue Statement.
	int i=1;
	while(i<=20)
	{
		if(i==6)
			continue;      //continue tells my runtime After continue in this iteration 
		                   //which is next statement are there should be skip,not Executed.
		System.out.println("i="+i);
		i++;
	}
}

}