package com.kpmg.bean;

import java.util.ArrayList;

public class Course {
	
	public  String courseID;
	public  int maxStudents;
	public  int enrolledStudents;
	public  ArrayList<String> students;
	public  String courseInstructor;
	public  int courseSection;
	public  String courseLocation;
	public ArrayList<String> studentCourses;
	
	
	public Course() {
		
	}
	
	public Course(String courseName, String courseID, Integer maxStudents, Integer enrolledStudents, 
			ArrayList<String> students, String courseInstructor, Integer courseSection, String courseLocation) {
		this.courseName = courseName;
		this.courseID = courseID;
		this.maxStudents = maxStudents;
		this.enrolledStudents = enrolledStudents;
		this.students = new ArrayList<String>();
		this.courseInstructor = courseInstructor;
		this.courseSection = courseSection;
		this.courseLocation = courseLocation;
		
	}
	
	public  String courseName;
	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}


	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	/**
	 * @return the courseID
	 */
	public String getCourseID() {
		return courseID;
	}


	/**
	 * @param courseID the courseID to set
	 */
	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}


	/**
	 * @return the maxStudents
	 */
	public int getMaxStudents() {
		return maxStudents;
	}


	/**
	 * @param maxStudents the maxStudents to set
	 */
	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}


	/**
	 * @return the enrolledStudents
	 */
	public int getEnrolledStudents() {
		return enrolledStudents;
	}


	/**
	 * @param enrolledStudents the enrolledStudents to set
	 */
	public void setEnrolledStudents(int enrolledStudents) {
		this.enrolledStudents = enrolledStudents;
	}


	/**
	 * @return the students
	 */
	public ArrayList<String> getStudents() {
		return students;
	}


	/**
	 * @param students the students to set
	 */
	public void setStudents(ArrayList<String> students) {
		this.students = students;
	}


	/**
	 * @return the courseInstructor
	 */
	public String getCourseInstructor() {
		return courseInstructor;
	}


	/**
	 * @param courseInstructor the courseInstructor to set
	 */
	public void setCourseInstructor(String courseInstructor) {
		this.courseInstructor = courseInstructor;
	}


	/**
	 * @return the courseSection
	 */
	public int getCourseSection() {
		return courseSection;
	}


	/**
	 * @param courseSection the courseSection to set
	 */
	public void setCourseSection(int courseSection) {
		this.courseSection = courseSection;
	}


	/**
	 * @return the courseLocation
	 */
	public String getCourseLocation() {
		return courseLocation;
	}


	/**
	 * @param courseLocation the courseLocation to set
	 */
	public void setCourseLocation(String courseLocation) {
		this.courseLocation = courseLocation;
	}


	/**
	 * @return the studentCourses
	 */
	public ArrayList<String> getStudentCourses() {
		return studentCourses;
	}


	/**
	 * @param studentCourses the studentCourses to set
	 */
	public void setStudentCourses(ArrayList<String> studentCourses) {
		this.studentCourses = studentCourses;
	}
	
	public void addStudentCourses(String courseID) {
		this.studentCourses.add(courseID);
	}
	public void removeStudentCourses(String courseID) {
		this.studentCourses.remove(courseID);
	}
	public void addStudent (String name) {
		this.students.add(name);
		this.enrolledStudents +=1;
	}
	
	public void removeStudent(String name) {
		this.students.remove(name);
		this.enrolledStudents -=1;
	}
	
	
	@Override
	public String toString() {
		return this.courseName + " " + this.courseID + " " + this.maxStudents + " " + this.enrolledStudents  + " " + this.students + " " + this.courseInstructor + " " + this.courseSection + " " + this.courseLocation;
	}

}
