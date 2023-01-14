/**
 * 
 */
package main.java.com.mycompany.training.designpatterns.intro;

/**
 * @author csmulay
 *
 */
public abstract class Duck {

	private String swim;
	private FlyBehaviour flyBehaviour;
	private QuackBehaviour quackBehaviour;
	
	public void swim() {
		
		System.out.println("I can swim ... ");
		
	}
	
	public abstract void display();
	
	public void performFly() {
		
		if (this.flyBehaviour == null) {
			return;
		}
		this.flyBehaviour.fly();
	}
	
	public void performQuack() {
		
		if (this.quackBehaviour == null) {
			return;
		}
		
		this.quackBehaviour.quack();
	}

	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}
	
}
