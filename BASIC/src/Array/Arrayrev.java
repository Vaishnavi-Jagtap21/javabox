package Array;

public class Arrayrev {

	public static void main(String[] args) {
		// Array Reverse
		//Array Even Number Addition
				int a[][]= {
						{15,22,35,48,59},
						{11,22,24,30,50},
						{21,25,27,29,37},
						{31,32,33,34,35}
					       };
				
//				for(int i=0;i<a.length;i++)
//				{
//					for(int j=0;j<a[i].length;j++)
//					{
//						
//							if(j==a[i].length-i-1)
//							{
//								System.out.println(a[i][j]);
//							}
//					}
//				}
				for(int i=0;i<a.length;i++)
				{
					for(int j=4;j<a[i].length;j--)
					{
						System.out.println(a[i][j]);
						i++;
					}
				}

	}

}
