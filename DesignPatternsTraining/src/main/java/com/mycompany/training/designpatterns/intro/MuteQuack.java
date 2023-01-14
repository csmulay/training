package main.java.com.mycompany.training.designpatterns.intro;

public class MuteQuack implements QuackBehaviour {

	@Override
	public void quack() {
		
		System.out.println("I do not quack ... ");

	}

}
