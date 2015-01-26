package strategyPattern;

public class Queen extends Character{

	@Override
	public void fight() {
		if (weapon != null)
			weapon.useWeapon();
	}

}
