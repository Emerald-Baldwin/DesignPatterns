package strategyPattern;

/**
 * Defines the expected behavior for a weapon.
 * Used in the Strategy pattern to allow
 * a family of classes to have similar, but
 * different actions.
 * @author Emerald
 *
 */
public interface WeaponBehavior {
	
	/**
	 * Prints a message regarding the
	 * action that is taken when this
	 * weapon is used.
	 */
	public abstract void useWeapon();
}