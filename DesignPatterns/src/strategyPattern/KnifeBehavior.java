package strategyPattern;

public class KnifeBehavior implements WeaponBehavior{

	@Override
	public void useWeapon() {
		System.out.println("You lunge at the enemy, nicking their arm with your blade.");
	}

}
