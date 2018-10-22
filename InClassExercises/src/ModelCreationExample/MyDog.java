package ModelCreationExample;

import java.time.LocalDate;

public class MyDog {
	private String breed;
	private String name;
	private int age;
	private String color;
	private static String homeAddress = "";
	private boolean isAsleep = false;
	
	public MyDog(String breed, String name, int birthYear, String color) {
		this.breed = breed;
		this.name = name;
		age = LocalDate.now().getYear()-birthYear;
		this.color = color;
	}
	
	public void walk() {
		System.out.println(name + " is walking.");
	}
	
	public void eat(String food ) {
		System.out.println(name + " is eating " + food);
	}
	
	public void sleep () { 
		setAsleep(true);
		System.out.println(name + " is sleeping.");
	}
	
	public void wakeUp() {
		setAsleep(false);
		System.out.println(name + " is awake.");
	}
	
	public void info() {
		System.out.printf("%s is a %d year old %s %s and lives in %s.\n", 
				name, age, color, breed, homeAddress);
	}

	public boolean isAsleep() {
		return isAsleep;
	}

	public void setAsleep(boolean isAsleep) {
		this.isAsleep = isAsleep;
	}
	
	public void move(String address) {
		homeAddress = address;
		System.out.printf("We moved to %s!\n",homeAddress);
	}
	
	public static boolean checkUpNeeded(MyDog dog) {
		return (dog.age-1) % 3 == 0;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
