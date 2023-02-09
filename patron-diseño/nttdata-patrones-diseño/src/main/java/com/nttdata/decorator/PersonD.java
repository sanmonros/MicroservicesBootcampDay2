package com.nttdata.decorator;

public class PersonD implements PersonI {

	private PersonI personInterface;

	
	public PersonD() {
		super();
	}
	
	public PersonD(PersonI personInterface) {
		this.personInterface = personInterface;
	}
	

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return personInterface.getName();
	}

	@Override
	public void setName(String name) {
		personInterface.setName(name);

	}

	@Override
	public int getAge() {
		return personInterface.getAge();
	}

	@Override
	public void setAge(int age) {
		personInterface.setAge(age);

	}

}
