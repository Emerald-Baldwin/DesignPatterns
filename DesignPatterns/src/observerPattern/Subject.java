package observerPattern;

/**
 * Interface for the Subject in the
 * Observer pattern. The Subject
 * contains a list of Observers and notifies
 * them when the model changes. (Used in
 * Model View Controller)
 * @author Emerald
 *
 */
public interface Subject {
	
	/**
	 * Add a new observer to the list of
	 * observers. If the observer already
	 * is contained in the list, do not
	 * add it again.
	 * @param o An object implementing the
	 * Observer interface to be added to the
	 * list of observers.
	 */
	public abstract void registerObserver(Observer o);
	
	/**
	 * Remove the given observer from the list of
	 * observers. If the observer is in the list and
	 * is removed, return true. Otherwise, return false.
	 * @param o The observer to remove from the list of
	 * observers.
	 * @return True if this observer is in the list and 
	 * was removed, otherwise false.
	 */
	public abstract boolean removeObserver(Observer o);
	
	/**
	 * Notifies all of the observers that the model has
	 * changed. This method should call update on the
	 * observers in the list.
	 */
	public abstract void notifyObservers();
}
