package strategyPattern;

public class Troll extends Character {

	@Override
	public void fight() {
		if (weapon != null)
			weapon.useWeapon();
	}

}
