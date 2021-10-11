package com.ust.test;
class Student{
	int rollNo;
	String name;
	static String collegeName;

}
public class StaticVar {

	public static void main(String[] args) {
		Student.collegeName= "Topper";
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s5 = new Student();
		s1.rollNo=1;
		s1.name="stud1";
		
		s2.rollNo=2;
		s2.name="stud2";
		
		s3.rollNo=3;
		s3.name="stud3";
		
		s5.rollNo=4;
		s5.name="stud4";
		
		System.out.println("Roll No: "+s1.rollNo+" Name: "+s1.name+" College Name: "+s1.collegeName);
		System.out.println("Roll No: "+s2.rollNo+" Name: "+s2.name+" College Name: "+s2.collegeName);
		System.out.println("Roll No: "+s3.rollNo+" Name: "+s3.name+" College Name: "+s3.collegeName);
		System.out.println("Roll No: "+s5.rollNo+" Name: "+s5.name+" College Name: "+s5.collegeName);
		
		s2.collegeName="new name";
		s2.name="ABC";
		
		System.out.println("Roll No: "+s1.rollNo+" Name: "+s1.name+" College Name: "+s1.collegeName);
		System.out.println("Roll No: "+s2.rollNo+" Name: "+s2.name+" College Name: "+s2.collegeName);
		System.out.println("Roll No: "+s3.rollNo+" Name: "+s3.name+" College Name: "+s3.collegeName);
		System.out.println("Roll No: "+s5.rollNo+" Name: "+s5.name+" College Name: "+s5.collegeName);
		


	}

}
