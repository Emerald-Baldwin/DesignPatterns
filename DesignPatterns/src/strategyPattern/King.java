package strategyPattern;

public class King extends Character{

	@Override
	public void fight() {
		if (weapon != null)
			weapon.useWeapon();
	}
	
}
