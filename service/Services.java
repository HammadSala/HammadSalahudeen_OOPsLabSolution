package com.greatlearning.lab.week1emailapp.service;

import com.greatlearning.lab.week1emailapp.utility.*;

public class Services {
	private static String password;
	private static String mailId;

	public static void generateEmailAddress(String firstName, String secondName, String techTeam, String company) {
		mailId = firstName + secondName + "@" + techTeam + company + ".com";
//		System.out.println(mailId);
	}

	public static void showCredentials(String firstName, String secondName, String techTeam, String company) {
		generateEmailAddress(firstName, secondName, techTeam, company);
		generatePassword();
		System.out.printf("Dear %S your generated credentials are : \nEmail\t\t --> %s \nPassword\t --> %s ", firstName,
				mailId, password);

	}

	public static void generatePassword() {
		password = util.randomNumbergen();

	}

}
