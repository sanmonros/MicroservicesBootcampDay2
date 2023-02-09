package com.nttdata.prototype;

import com.nttdata.decorator.PersonI;

public class Person implements Cloneable,PersonI {

	private String name;
	private int age;

	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}



	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public Person clone() throws CloneNotSupportedException {
		return (Person) super.clone();
	}



	public String getEdad() {
		// TODO Auto-generated method stub
		return null;
	}
}
