
public class continue_2 {
	public int check()
	{
		int cnt=0;
		
		for( ;cnt<=20;cnt+=2)
           if(cnt==10)
				continue;
			System.out.println(cnt);
		
	return 0;
}


	public static void main(String[] args) {
	
    continue_2 obj=new continue_2();
    obj.check();
	}

}
