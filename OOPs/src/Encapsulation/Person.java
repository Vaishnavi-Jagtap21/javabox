package Encapsulation;
class p{
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
}
public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        p n=new p();
        n.setA(10);
        System.out.println("Age is : "+n.getA());
	}

}
