package Pattern;

public class LeftTriangle {

	public static void main(String[] args) {
		// Left Triangle
		for(int i=1;i<=5;i++)
		{
			for(int j=0;j>i;j--)
			{
			  System.out.print(' ');
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}



