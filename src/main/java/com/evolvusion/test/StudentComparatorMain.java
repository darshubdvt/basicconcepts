package com.evolvusion.test;

import java.util.ArrayList;
import java.util.List;

import com.evolvusion.comparators.StudentComparator;
import com.evolvusion.pojo.Student;

public class StudentComparatorMain {

	public static void main(String[] args) {

		List<Student> st = new ArrayList<>();

		Student t1 = new Student("darshan", 100);

		Student t2 = new Student("darshan", 102);

		Student t3 = new Student("darshan", 1);

		Student t4 = new Student("darshan", 10);

		st.add(t1);

		st.add(t2);

		st.add(t3);

		st.add(t4);
		
		StudentComparator sidcompartr = new StudentComparator();
		
		List<Student> cmbyid= new ArrayList<>();

	}

}
