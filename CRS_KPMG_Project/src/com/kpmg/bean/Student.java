package com.kpmg.bean;
import java.util.ArrayList;

public class Student {
	
	public String firstName;
	public String lastName;
	public String username;
	public String password;
	
	//Define constructors
	public Student() {
			
	}
	
	public static Student student = new Student();
	public Student (String fN, String lN, String usn, String psw, ArrayList<String> courses) {
		this.firstName = fN;
		this.lastName = lN;
		this.username = usn;
		this.password = psw;
		Student.registeredCourses = courses;
	}
	
	public static ArrayList<String> registeredCourses = new ArrayList<String>();
	/**
	 * @return the registeredCourses
	 */
	public static ArrayList<String> getRegisteredCourses() {
		return registeredCourses;
	}

	/**
	 * @param registeredCourses the registeredCourses to set
	 */
	public static void setRegisteredCourses(ArrayList<String> registeredCourses) {
		Student.registeredCourses = registeredCourses;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
}

