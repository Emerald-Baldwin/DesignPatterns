package observerPattern;

/**
 * Defines the behavior for the Observer
 * object in the Observer pattern.
 * @author Emerald
 *
 */
public interface Observer {
	
	/**
	 * Called when the model changes.
	 * This method completes any 
	 * necessary tasks that result 
	 * from the model changing.
	 */
	public abstract void update();
}
