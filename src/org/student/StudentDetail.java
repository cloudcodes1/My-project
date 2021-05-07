package org.student;

import java.util.Scanner;

public class StudentDetail {
public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	System.out.println("Enter student name");
	String next = a.next();
	System.out.println("Student name is "+next);
	
	System.out.println("Enter your Id");
	int nextInt = a.nextInt();
	System.out.println("Student Id is"+nextInt);
	
	System.out.println("Enter student dept");
	String next2 = a.next();
	System.out.println("Dept : "+next2);
	
	System.out.println("Enter your mob no.");
	long nextLong = a.nextLong();
	System.out.println("Mob no is "+nextLong);
	
	System.out.println("Gender");
	String next3 = a.next();
	System.out.println("Gender is "+next3);
	
	System.out.println("Enter city");
	String next4 = a.next();
	System.out.println("City is "+next4);
	
	System.out.println("Enter Ex Girl name");
	String next5 = a.next();
	System.out.println("Ex girl name is"+next5);
	
	System.out.println("passport No");
	String next6 = a.next();
	System.out.println("PassPort No is "+next6);
	
	System.out.println("Aadhar No");
	String next7 = a.next();
	System.out.println("Aadhar No is "+next7);
	
	System.out.println("Pan card No");
	String next8 = a.next();
	System.out.println("Pan Card No is"+next8);
	
}
}
