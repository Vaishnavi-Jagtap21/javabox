package Inheritance;
class Animal
{
	 void eat() 
	 {

		 System.out.println("Animal eats food");
	 }
}
class Dog extends Animal {
	    void color() {
	        System.out.println("Dog white");
	    }
	}
public class SingalInheritance {

	public static void main(String[] args) {
		Animal a=new Animal();
		a.eat();
		Dog d=new Dog();
		d.color();

	}

}