package observerPattern;

import java.util.ArrayList;

public class ConcreteSubject implements Subject {
	private ArrayList<Observer> observers;
	
	/**
	 * Constructor. Instantiates the
	 * list of observers.
	 */
	public ConcreteSubject() {
		observers = new ArrayList<Observer>();
	}
	
	/**
	 * Adds the passed in Observer to the list
	 * of Observers. If the Observer is already in
	 * the list, it is not added to the list again.
	 * @param o The Observer to add to the list
	 */
	@Override
	public void registerObserver(Observer o) {
		if (!observers.contains(o))
			observers.add(o);
	}

	/**
	 * Removes the passed in Observer from the
	 * list of Observers. Returns true if the
	 * given Observer is in the list and has
	 * been removed. Otherwise, returns false.
	 * @param o The Observer to remove from the list.
	 * @return True if the Observer was in the list
	 * and has been removed. Otherwise false.
	 */
	@Override
	public boolean removeObserver(Observer o) {
		if (observers.contains(o)) {
			observers.remove(o);
			return true;
		}
		return false;
	}

	/**
	 * Notifies all Observers of changes
	 * in the model. This method calls
	 * update for each observer.
	 */
	@Override
	public void notifyObservers() {
		for (Observer o : observers)
			o.update();
	}

}
