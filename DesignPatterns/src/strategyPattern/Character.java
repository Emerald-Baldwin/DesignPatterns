package strategyPattern;

/**
 * Abstract class that represents the basic requirements
 * of a Character. Makes use of the Strategy pattern
 * to provide different weapon behaviors.
 * @author Emerald
 *
 */
public abstract class Character {
	protected WeaponBehavior weapon;
	
	/**
	 * Sets the weapon of this character
	 * to the passed in weapon behavior.
	 * @param w The weapon behavior that this
	 * character wields
	 */
	public void setWeapon(WeaponBehavior w) {
		this.weapon = w;
	}
	
	/**
	 * Performs the fight maneuver using the
	 * given weapon. setWeapon must be called
	 * previously.
	 */
	public abstract void fight();
}
