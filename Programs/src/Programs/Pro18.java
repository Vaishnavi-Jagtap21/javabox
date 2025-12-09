package Programs;

import java.util.Scanner;

public class Pro18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter number: ");
		        int n = sc.nextInt();
		        int t = n;
		        int sum = 0;
		        while (n > 0) {
		            int r = n % 10;
		            sum += r * r * r; // cube for 3-digit Armstrong
		            n = n / 10;
		        }
		        if (t == sum) System.out.println(t + " is an Armstrong number");
		        else System.out.println(t + " is not an Armstrong number");
		        sc.close();
		    

	}

}
