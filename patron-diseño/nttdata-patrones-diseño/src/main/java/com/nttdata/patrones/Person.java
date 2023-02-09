package com.nttdata.patrones;

public class Person {

	private static Person instance = null;
    private String name;
    private int age;
    
    private Person() {
    	
    }
    
    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public static Person getInstance(String name, int age) {
        if (instance == null) {
            instance = new Person(name, age);
        }
        return instance;
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
    
    
}
