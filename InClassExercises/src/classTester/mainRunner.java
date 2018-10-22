package classTester;

import ModelCreationExample.*;

public class mainRunner {

	public static void main(String[] args) {
		
		modelCreationExample();
		
		
		myDogExample();
	}

	
	
	static void modelCreationExample () {
		Student s1 = new Student("0001", "Michael", "Gabriel", "mgabriel@perscholas.org", "123-456-7890");
		Student s2 = new Student("0002", "Bairon", "Vasquez", "bvasquez@perscholas.org", "123-456-7891");
		Student[] students = {s1, s2};
		studentDisplay(students);
	}
	static void studentDisplay(Student[] students) {
		System.out.printf("%-4s|%-10s |%-10s |%-25s |%-12s\n", "ID", "First Name", "Last Name", "E-Mail", "Phone Number");
		for(Student s: students) 
			System.out.printf("%-4s|%-10s |%-10s |%-25s |%-12s\n", s.getId(), s.getFirstName(), s.getLastName(), s.getEmail(), s.getPhone());
	}
	static void myDogExample() {
		MyDog d1 = new MyDog("Doberman", "Ralph", 2010, "Brown");
		d1.walk();
		d1.sleep();
		
		MyDog d2 = new MyDog("Golden Retriever", "Clifford", 2014, "Red");
		d2.wakeUp();
		
		d1.move("Boston");
		
		d1.info();
		d2.info();
		
		checkDog(d1);
		checkDog(d2);
		
	}
	
	static void checkDog(MyDog dog) {
		System.out.printf("%s %s a check up.\n", dog.getName(), MyDog.checkUpNeeded(dog)?"needs":"does not need");
	}
	
}
