package Star;

public class Star10 {

	public static void main(String[] args) {
		for(int r=0;r<9;r++)//012 5
		{
			for(int c=0;c<9;c++)//01234
			{  
				if(r+c==1&&r-c==1)
				{
					System.out.print("*");
				}
			}
			
		}
	}

}
