package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.print("Name: ");
		student.name = sc.nextLine();
		System.out.print("First grade: ");
		student.firstGrade = sc.nextDouble();
		System.out.print("Second grade: ");
		student.secondGrade = sc.nextDouble();
		System.out.print("Third grade: ");
		student.thirdGrade = sc.nextDouble();
		
		System.out.println();
		System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());
		
		if (student.finalGrade() < 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", student.missingPoints());
		} else {
			System.out.println("PASS");
		}
		
		sc.close();
	}

}
