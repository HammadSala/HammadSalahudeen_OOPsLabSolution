package com.greatlearning.lab.week1emailapp.model;

import com.greatlearning.lab.week1emailapp.service.*;
import com.greatlearning.lab.week1emailapp.utility.*;

public class Employee {

	private String firstName, secondName, techTeam;
	private final String company = "abc";

	public Employee(String firstName, String secondName) {
		this.firstName = firstName;
		this.secondName = secondName;
	}

	public String getEmployee() {
		return this.firstName + this.secondName;
	}

	public void setTechteam(String techTeam) {
		this.techTeam = techTeam;
	}

	public void showCredentials() {
		Services.showCredentials(firstName, secondName, techTeam, company);
	}

}
