package Programs;

import java.util.Scanner;

public class Pro20 {

	public static void main(String[] args) {
		// display roll no,name,marks,subject
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll no: ");
        int rn = sc.nextInt();
        System.out.print("Enter Name: ");
        String nm = sc.next();
        System.out.print("Enter mark1: ");
        int m1 = sc.nextInt();
        System.out.print("Enter mark2: ");
        int m2 = sc.nextInt();
        System.out.print("Enter mark3: ");
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        float percent = total / 300.0f * 100.0f;

        System.out.println("Roll No: " + rn + " Name: " + nm);
        System.out.println("Total marks: " + total);
        System.out.println("Percentage: " + percent + "%");
        sc.close();
	}

}
