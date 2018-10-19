package classTester;

import ModelCreationExample.*;

public class mainRunner {

	public static void main(String[] args) {
		modelCreationExample();
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
	
}
