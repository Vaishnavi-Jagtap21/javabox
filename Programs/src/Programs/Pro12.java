package Programs;

import java.util.Scanner;

class Rclass {
    private int n, num;
    private final Scanner sc = new Scanner(System.in);

     void reverse() {
        System.out.print("Enter a number: ");
        n = sc.nextInt();

        while (n > 0) {
            num = n % 10;
            System.out.print(num);
            n = n / 10;
        }

        System.out.println();
    }
}

public class Pro12 {

	public static void main(String[] args) {
		// Reverse number
		Rclass r = new Rclass();
        r.reverse();
	}

}
