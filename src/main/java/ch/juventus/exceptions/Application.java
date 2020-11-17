package ch.juventus.exceptions;

public class Application {

	public static void main(String[] args) throws PersonNotFoundException {

		PersonRepository personRepo1 = new PersonRepository();

		try {
			personRepo1.addPerson();
		} catch (Exception e){
			System.out.println(e);
		}

		try {
			personRepo1.findById(42);
		}	catch (PersonNotFoundException e) {
			System.err.println(e.getMessage());
		}


	}

}
