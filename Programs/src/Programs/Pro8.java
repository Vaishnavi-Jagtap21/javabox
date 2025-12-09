package Programs;
import java.util.Scanner;

class Hclass {
    Scanner sc = new Scanner(System.in);
    private int m;

    public void result() {
        System.out.print("Enter marks: ");
        m = sc.nextInt();

        if (m < 35) {
            System.out.println("Result: Fail");
        } else {
            System.out.println("Result: Pass");
        }
    }
}

public class Pro8 {

	public static void main(String[] args) {
		//IF else Program
		 Hclass h = new Hclass();
	        h.result();

	}

}
