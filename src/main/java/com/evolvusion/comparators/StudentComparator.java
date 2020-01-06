package com.evolvusion.comparators;

import java.util.Comparator;

import com.evolvusion.pojo.Student;

public class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o2.getId()-o1.getId();
	}
}
