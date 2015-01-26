package strategyPattern;

public class BowAndArrowBehavior implements WeaponBehavior{

	@Override
	public void useWeapon() {
		System.out.println("Grimacing, you pull back on the " + 
				"bow. You aim carefully, and let your arrow fly. " +
				"It reaches its mark.");
	}

}
