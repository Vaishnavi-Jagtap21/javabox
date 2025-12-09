package Programs;

import java.util.Scanner;

public class Pro19 {

	public static void main(String[] args) {
		// do while loop program
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int x = 1;
        long fact = 1;
        do {
            fact = fact * x;
            x++;
        } while (x <= n);
        System.out.println(n + " factorial is " + fact);
        sc.close();
	}

}
