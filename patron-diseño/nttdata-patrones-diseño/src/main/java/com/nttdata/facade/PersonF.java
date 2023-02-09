package com.nttdata.facade;

import java.util.ArrayList;
import java.util.List;

public class PersonF  {

	private String name;
	private int age;

	public PersonF(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public List<PersonF> getPersonasEntre20y30() {
		// TODO Auto-generated method stub
		return null;
	}

}

class FachadaPersonas implements PersonI {
	private List<PersonF> person;

	public FachadaPersonas() {
		person = new ArrayList<>();
		person.add(new PersonF("Santi", 30));
		person.add(new PersonF("Pablo", 27));
		person.add(new PersonF("Rafa", 27));
		person.add(new PersonF("Juana", 32));
	}

	public List<PersonF> getPersonasEntre20y30() {
		List<PersonF> personas20y30 = new ArrayList<>();
		for (PersonF p : person) {
			if (p.getAge() >= 20 && p.getAge() <= 30) {
				personas20y30.add(p);
			}
		}
		return personas20y30;
	}
}