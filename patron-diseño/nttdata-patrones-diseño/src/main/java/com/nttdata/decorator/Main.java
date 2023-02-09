package com.nttdata.decorator;

import com.nttdata.prototype.Person;

public class Main {

	PersonI personInterface;

	public static void main(String[] args) {
		Person p1 = new Person(null, 0);
		p1.setName("Santi");
		p1.setAge(30);

		PersonI personI = new Person(null, 0);
		
		PersonI personPrueba = new PersonD(personI);
	}

}
