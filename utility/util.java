package com.greatlearning.lab.week1emailapp.utility;

import java.util.Random;

public class util {
	static String[] passgen = new String[8];
	static Random rand = new Random();

	public static String randomNumbergen() {

		final String textOptions = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+/";

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 8; i++) {
			int r = rand.nextInt(76);
			sb.append(textOptions.charAt(r));
		}

		return sb.toString();

	}

}
