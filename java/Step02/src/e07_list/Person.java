package e07_list;

import java.util.Objects;

public class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + "/" + age ;
	}
	
	@Override
	public int hashCode() {
		System.out.println("Person - Hash");
		return Objects.hash(age, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Person - Equals");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	
}
