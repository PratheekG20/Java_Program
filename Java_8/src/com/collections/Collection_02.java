package com.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class Collection_02 {
	static class Person {
		String name;
	    Integer age;
	    public Person(String name, int age) {
			this.name=name;
			this.age=age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
	}
	
	public static void main(String[] args) {
		Person alex=new Person("Alex", 23);
	    Person john = new Person("John", 40);
	    Person peter = new Person("Peter", 32);
	    List<Person> people = Arrays.asList(alex, john, peter);

	    // then
	    Person minByAge = people
	      .stream()
	      .min(Comparator.comparing(Person::getAge))
	      .orElseThrow(NoSuchElementException::new);
	    System.out.println(minByAge.getName());
	}
}
