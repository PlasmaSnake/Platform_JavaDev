package MonsterPolymorphism;

public class StoneMonster extends Monster{
	public StoneMonster(String name) {
		super(name);
	}
	
	protected String attack() {
		return ("Attack with earth!");
	}
}
