package Programs;
import java.util.Scanner;

class Fclass {
    private int n, i, fact = 1;
    Scanner sc = new Scanner(System.in);

    public void display() {
        System.out.print("Enter number: ");
        n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial of " + n + " is " + fact);
    }
}

public class Pro11 {

	public static void main(String[] args) {
		// factorial 
		Fclass f=new Fclass();
		f.display();
	}

}
