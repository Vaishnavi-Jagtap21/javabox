package demo;

public class demo1 {

	public static void main(String[] args) {
//		Count of number
		int num=12340;
		int cnt=0;
		while(num>0) //12340>0 1234>0 
		{
			num=num/10;//12340/10=1234 1234/10=123
			cnt++; //1,2
		}
		System.out.println(cnt);
		
		
		

	}

}
