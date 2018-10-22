package MonsterPolymorphism;

public class FireMonster extends Monster{
	public FireMonster(String name) {
		super(name);
	}
	
	protected String attack() {
		return ("Attack with flames!");
	}
}
