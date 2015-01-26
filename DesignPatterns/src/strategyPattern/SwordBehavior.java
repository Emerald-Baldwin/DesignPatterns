package strategyPattern;

public class SwordBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("You raise your greatsword " +
					"above your head, parrying your " +
					"opponent's attack.");
		
	}
	
}
