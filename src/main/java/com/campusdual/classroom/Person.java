package com.campusdual.classroom;

public class Person {
	protected String name;
	protected String surname;

	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public void getDetails() {
		StringBuilder sb = new StringBuilder("Nombre: ");
		sb.append(name).append(" ").append(surname);
		System.out.println(sb);
	}
}
