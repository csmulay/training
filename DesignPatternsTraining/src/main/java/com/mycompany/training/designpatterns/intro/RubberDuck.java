package main.java.com.mycompany.training.designpatterns.intro;

public class RubberDuck extends Duck {
	
	public RubberDuck() {
		
		QuackBehaviour quackBehaviour = new Squeak();
		this.setQuackBehaviour(quackBehaviour);
		
		FlyBehaviour flyBehaviour = new FlyNoWay();
		this.setFlyBehaviour(flyBehaviour);
		
	}
	
	@Override
	public void display() {
		
		System.out.println("I am yellow ... ");

	}

}
