package main.java.com.mycompany.training.designpatterns.intro;

public class Mallard extends Duck {
	
	
	public Mallard() {
		
		QuackBehaviour quackBehaviour = new Quack();
		this.setQuackBehaviour(quackBehaviour);
		
		FlyBehaviour flyBehaviour = new FlyWithWings();
		this.setFlyBehaviour(flyBehaviour);
		
	}

	@Override
	public void display() {

		System.out.println("I am green ... ");

	}

}
