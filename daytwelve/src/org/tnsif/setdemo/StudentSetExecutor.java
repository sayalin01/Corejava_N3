package org.tnsif.setdemo;

import java.util.LinkedHashSet;
import java.util.Set;

public class StudentSetExecutor {
	public static void addStudent(Set<Student>obj)
	{
		Student student1=new Student(101,"Sayali",90.20f);
		Student student2=new Student(102,"Shreya",80.30f);
		Student student3=new Student(103,"Shreya",70.40f);
		obj.add(student1);
		obj.add(student2);
		obj.add(student3);
		
		
	}

	public static void main(String[] args) {
		Set<Student>obj=new LinkedHashSet<Student>();
		addStudent(obj);
		System.out.println(obj);
	

	}

}
