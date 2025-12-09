package Star;

public class Star9 {

	public static void main(String[] args) {
		for(int r=0;r<9;r++)//012 5
		{
			for(int c=0;c<9;c++)//01234
			{  
				if(c+r>=8&&c-r>=0)
				System.out.print("*"); //* * * *
				else
					System.out.print(" ");
			}
			System.out.println();//next line
		}
	}

}
