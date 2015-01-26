package strategyPattern;

public class Knight extends Character {

	@Override
	public void fight() {
		if (weapon != null)
			weapon.useWeapon();
	}

}
