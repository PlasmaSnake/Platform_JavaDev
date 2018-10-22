package MonsterPolymorphism;

public class Monster {
	String name;
	
	public Monster(String name) {
		this.name = name;
	}
	
	protected String attack() {
		return ("Unable to attack because weaksauce");
	}
}
