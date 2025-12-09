package Programs;
import java.util.Scanner;

class Nclass {
    private int i, j, n;
    Scanner sc = new Scanner(System.in);

    public void display() {
        System.out.print("Enter a number: ");
        n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= 1; j++) {
                System.out.println("*");
            }
        }
    }
}

public class Pro13 {

	public static void main(String[] args) {
		// Pattern Program
		Nclass n = new Nclass();
        n.display();
	}

}
