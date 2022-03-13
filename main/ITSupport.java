package com.greatlearning.lab.week1emailapp.main;

import java.util.Scanner;
import com.greatlearning.lab.week1emailapp.model.*;

public class ITSupport {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int option;
		String department = null;
		Employee emp = new Employee("Hammad", "Sala");

		System.out.println("Please enter the department from the following ");
		System.out.println("1. Technical \n2. Admin \n3. Human Resource \n4. Legal");

		option = sc.nextInt();
		switch (option) {
		case 1:
			department = "tech";
			break;

		case 2:
			department = "admin";
			break;

		case 3:
			department = "hr";
			break;

		case 4:
			department = "legal";
			break;

		default:
			System.out.println("Invalid Options!, Exiting ...");

		}

		emp.setTechteam(department);

		emp.showCredentials();

	}

}
