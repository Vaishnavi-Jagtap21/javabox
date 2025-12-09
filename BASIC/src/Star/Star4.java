package Star;

public class Star4 {

	public static void main(String[] args) {
		for(int r=0;r<5;r++)//012 5
		{
			for(int c=0;c<5;c++)//01234
			{  
				if(c+r==4)
				System.out.print("*"); //* * * *
				else
					System.out.print(" ");
			}
			System.out.println();//next line
		}

	}

}
