package Programs;
import java.util.Scanner;
class PrClass {
 private int c;

 public int add(int a, int b) {
     c = a + b;
     return c;
 }
}
public class Pro7 {

	public static void main(String[] args) {
		// Parameteric return with value
		 Scanner sc = new Scanner(System.in);

	     System.out.println("Enter two numbers:");
	     int x = sc.nextInt();
	     int y = sc.nextInt();

	     PrClass pr = new PrClass();
	     int z = pr.add(x, y);

	     System.out.println(x + " and " + y + " addition is " + z);

	     sc.close();
	}

}
