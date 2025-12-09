package demo;

public class demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1234=1+2+3+4=10
				int num=1234;
				int sum=0;
				while(num>0) //1234>0 123>0 12>0 1>0 0>0
				{
					int temp=num%10; //4 1234%10=4
					sum=sum+temp;//0+4=4
					num=num/10;//1234/10=123
				}
				System.out.println(sum);
	}

}
