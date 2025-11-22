package Question;

import java.util.Scanner;

public class Fibbon {

	public static void main(String[] args) {
		// Fibonacci Series
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number for Fibonacci Series : ");
		int n = sc.nextInt(); // number of terms
        int a = 0, b = 1;

        System.out.println("Fibonacci Series: " + a + " " + b);

        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
	}

}
