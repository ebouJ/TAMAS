package ca.mcgill.ecse321.TAMAS.controller;

import ca.mcgill.ecse321.TAMAS.model.Course;
import ca.mcgill.ecse321.TAMAS.model.EceAdmin;
import ca.mcgill.ecse321.TAMAS.model.Evaluation;
import ca.mcgill.ecse321.TAMAS.model.Instructor;
import ca.mcgill.ecse321.TAMAS.model.Job;
import ca.mcgill.ecse321.TAMAS.model.Person;
import ca.mcgill.ecse321.TAMAS.model.Student;
import ca.mcgill.ecse321.TAMAS.model.Tamas;
import ca.mcgill.ecse321.TAMAS.controller.InvalidInputException;
import ca.mcgill.ecse321.TAMAS.application.TamasApplication;

public class InstructorController {

	public void postJob(String instructorName, String courseName, String jobType, int numHours, String description)
			throws InvalidInputException {
		Tamas tamas = TamasApplication.getTamas();

		// check if the job is for TA or Grader
		boolean isTaJob = false;
		if (jobType.equals("TA"))
			isTaJob = true;

		// finding the instructor in tamas
		Instructor instructor = null;
		for (Person person : tamas.getPersons()) {
			if (person.getName().equals(instructorName) && person instanceof Instructor) {
				instructor = (Instructor) person;
			}
		}

		// finding the course in tamas
		Course course = null;
		for (Course c : tamas.getCourses()) {
			if (c.getCourseCode().equals(courseName))
				course = c;
		}

		// add the job to tamas
		try {
			Job job = new Job(numHours, 0, isTaJob, false, false, description, "", course, tamas);
			tamas.addJob(job);
		} catch (RuntimeException e) {
			throw new InvalidInputException(e.getMessage());
		}
	}
	
	public void postJob(String instructor_name, String course, String job_type, int hour,
			String description, String daysofweek, int[] times){
		
		JobPostingPersistence jpp = new JobPostingPersistence();
		jpp.submitJobPostingtoDB(instructor_name, course, job_type, hour,
			description, daysofweek, times);
	}

}
