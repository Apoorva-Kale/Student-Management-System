package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses;
	private int tutionBalance;
	private static int costOfCourse = 3600;
	private static int id = 1000;
	private int payment;
	
	// Constructor : prompt users to enter name and year
	Scanner sc = new Scanner(System.in);
	public Student() {
		System.out.print("Enter first name : ");
		this.firstName = sc.nextLine();
		
		System.out.print("Enter last name : ");
		this.lastName = sc.nextLine();
		
		System.out.println("1 - Freshman \n2 - Sophomore \n3 - Junior \n4 - Senior");
		this.gradeYear = sc.nextInt();
		
		setStudentID();
	}
	
	// Generate an ID
	private void setStudentID() {
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	// Enroll in courses
	public void enroll() {
		do {
			System.out.print("Enter course to enroll (Q to quit) : ");
			String course = sc.nextLine();
	
			if(!course.equals("Q")) {
				tutionBalance = tutionBalance + costOfCourse;
				courses = courses +  "\n" + course;
			} else {
				break;
			}
		}while(1 != 0);
	}
	
	// View balance
	public void viewBalance() {
		System.out.println("Your balance is Rs." + tutionBalance + "/-");
	}
	
	// Pay tution
	public void payTution() {
		viewBalance();
		System.out.print("Enter your payment : Rs. ");
		payment = sc.nextInt();
		tutionBalance = tutionBalance - payment;
		System.out.println("Thank you for your payment of Rs." + payment + "/-");
		viewBalance();
	}
	
	// Show status
	public String showInfo() {
		return "Name : " + firstName + lastName +
				"\nGrade Level : " + gradeYear + 
				"\nStudent ID : " + studentID + 
				"\nCourses Enrolled : " + courses +
				"\nBalance : " + payment;
	}
}
