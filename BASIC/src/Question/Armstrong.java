package Question;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		//Armstrong Number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int num = sc.nextInt();
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit * digit; // cube
            num = num / 10;
        }

        if (sum == original)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");

	}

}
