package Abstraction;

abstract class Bike
{
abstract void run();
}
class Hero extends Bike
{  
	void start()
	{
		System.out.println("Bike starts");
	}
	void run()
	{
		System.out.println("The XMR 250 Runs very well which is from Hero Motors");
	}
	static String stop()
	{
		return "Bike is Stop";
	}
}
public class abstraction {
 
	public static void main(String[] args) {
		Hero h=new Hero();
		h.start();
		h.run();
		System.out.println(Hero.stop());
	}

}
