package com.Test3;

public class Student {
	private String name;
	private int age;
	private int height;
	private int weight;
	
	public Student() {
	
	}

	public Student(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public String studentInfo() {
		String info = name + "\t" + age +"\t" + height + "\t" + weight;
		return info ;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}
	
}
