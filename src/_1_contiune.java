import java.util.Scanner;

public class _1_contiune {
	public int Check()
	{
		int cnt=0;
		while(cnt<=20)
		{
			cnt+=2;
			if(cnt==10)
				continue;
			System.out.println(cnt);
		}
		return 0; 
	}
	

	public static void main(String[] args) {
		_1_contiune obj=new _1_contiune();
		//int n,cnt=0;
		int ans=obj.Check();
		System.out.println(ans);
		
	}

}
