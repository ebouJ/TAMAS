package ca.mcgill.ecse321.TAMAS.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ca.mcgill.ecse321.TAMAS.application.TamasApplication;
import ca.mcgill.ecse321.TAMAS.model.Course;
import ca.mcgill.ecse321.TAMAS.model.Instructor;
import ca.mcgill.ecse321.TAMAS.model.Job;
import ca.mcgill.ecse321.TAMAS.model.JobApplication;
import ca.mcgill.ecse321.TAMAS.model.Student;


public class StudentController {

	public StudentController(){
	}
	
	
	public List<Course> getListOfCoursesThatHaveOpenPositions(){
		ArrayList<Course> listOfCourses = new ArrayList<Course>();
		for (Course course : TamasApplication.getTamas().getCourses()) {
			// A Course hasOpenPositions when it has at least one Job IsPosted or AppliedTo
			int openPositions = 0;
			// Get the Jobs for each course
			for(Job job : course.getJobs()){
				String jobState = job.getJobStateFullName();
				if(jobState.equalsIgnoreCase("IsPosted") || jobState.equalsIgnoreCase("AppliedTo")){
					openPositions++;
				}
			}
			if (openPositions > 0) {
				listOfCourses.add(course);				
			}
		}
		return listOfCourses;
	}
	
	public List<Job> getAvailableJobs(Course course) {
		ArrayList<Job> listOfJobs = new ArrayList<Job>();
		for(Job job : course.getJobs()){
			String jobState = job.getJobStateFullName();
			if(jobState.equalsIgnoreCase("IsPosted") || jobState.equalsIgnoreCase("AppliedTo")){
			// job is open for applications
				listOfJobs.add(job);
			}
		}
		return listOfJobs;
	}
	
	public String displayJob(Job job){
		String jobTitle = job.getCourse().getCourseCode();
		if(job.getIsTaJob()){
			return jobTitle + " TA "; 
		}
		else{
			return jobTitle + " Marker ";
		}
	}
	
	public String getDetailsOfJob(Job job){
		String Instructors = "";
		int nIns = job.getCourse().numberOfInstructors();
		if(nIns == 1){
			String name = job.getCourse().getInstructor(0).getName();
			Instructors = "Instructor: " + name + " ";
		}
		else{
			Instructors = "Instructors: ";
			for(int i=0; i<nIns; i++){
				String name = job.getCourse().getInstructor(i).getName();
				if (i<nIns-1){
					Instructors = Instructors + name + ", ";
				}
				else{
					Instructors = Instructors + name + " ";
				}
			}
		}
		
		// Add hours
		String details = "\n" + Instructors + "\n\nDescription: " + job.getDescription() + "\n";
		return details;
	}
	
	public JobApplication applyForJob(Student student, Job job){
		// This method takes the Student info+CV and the job, then creates a JobApplication 
		// Student info+CV is the Sudent's attributes and their experience
		
		// TODO
		return null;
	}
	
}
