package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// Ask how many users you want to add
		Scanner sc = new Scanner(System.in);
		System.out.println("How many students you want to add? ");
		int n = sc.nextInt();
		Student stud[] = new Student[n];
		
		// Create n number of students
		for(int i=0;i<n;i++) {
			stud[n-1] = new Student();
			stud[n-1].enroll();
			stud[n-1].payTution();
			System.out.println(stud[n-1].showInfo());
		}
	}

}
