package main.java.com.mycompany.training.designpatterns.intro;

public class WhoAmI {

	public static void main(String[] args) {
		
		
		Duck duck1 = new Mallard();
		duck1.swim();
		duck1.performFly();
		duck1.performQuack();
		duck1.display();
		System.out.println("Guess who am I?\n");
		
		Duck duck2 = new RubberDuck();
		duck2.swim();
		duck2.performFly();
		duck2.performQuack();
		duck2.display();
		System.out.println("Guess who am I?\n");

	}

}
