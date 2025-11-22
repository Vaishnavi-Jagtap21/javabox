package Array;

public class Arrayadd {

	public static void main(String[] args) {
		//Array Even Number Addition
		int a[][]= {
				{1,2,3,4,5},
				{11,22,24,30,50},
				{21,25,27,29,37},
				{31,32,33,34,35}
			       };
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]%2==0)
				{
					System.out.println(a[i][j]);
				}
			}
		}
		
		

	}

}
