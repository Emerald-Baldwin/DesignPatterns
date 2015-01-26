package strategyPattern;

public class AxeBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("Yelling, you charge, " + 
				"raising your axe high above your " +
				"head. Your axe comes down with a " +
				"dull thud.");
	}

}
