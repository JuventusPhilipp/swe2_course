package ch.juventus.exceptions;

import ch.juventus.object.Person;

public class PersonRepository {

	public Person findById(int id) throws PersonNotFoundException {
		throw new PersonNotFoundException(String.format("No person found with ID: %d", id));
	}

	public void addPerson() throws IllegalArgumentException {
		throw new IllegalArgumentException(String.format("Person Object not allowed"));
	}

}
