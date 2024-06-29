package aplication;

import java.util.Scanner;

import entities.Student;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Student st= new Student();
		
		st.name = sc.nextLine();
		st.first = sc.nextDouble();
		st.second = sc.nextDouble();
		st.third = sc.nextDouble();
		
		double finalGrade = st.finalGrade();
		System.out.println("FINAL GRADE: " + finalGrade);
		if(finalGrade >= 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS" , st.missing());
		}
		
		sc.close();
	}

}
