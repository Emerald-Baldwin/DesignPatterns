package observerPattern;

public class ConcreteObserver implements Observer{

	/**
	 * Completes all necessary actions for this
	 * Observer when the model has been updated.
	 */
	@Override
	public void update() {
		System.out.println("The Subject was updated!");
	}
}
