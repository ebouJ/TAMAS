package ca.mcgill.ecse321.TAMAS.application;

import ca.mcgill.ecse321.TAMAS.model.Person;
import ca.mcgill.ecse321.TAMAS.model.Tamas;
import ca.mcgill.ecse321.TAMAS.model.Course;
import ca.mcgill.ecse321.TAMAS.model.Job;
import ca.mcgill.ecse321.TAMAS.persistence.PersistenceObjectStream;
import ca.mcgill.ecse321.TAMAS.view.JobApplicationPage;
import ca.mcgill.ecse321.TAMAS.view.JobApplicationReviewPage;
import ca.mcgill.ecse321.TAMAS.view.JobOfferPage;
import ca.mcgill.ecse321.TAMAS.view.JobPostDisplayPage;
import ca.mcgill.ecse321.TAMAS.view.LoginPage;
import ca.mcgill.ecse321.TAMAS.view.PostJobPage;
import ca.mcgill.ecse321.TAMAS.view.UploadCoursePage;
import ca.mcgill.ecse321.TAMAS.view.UploadSchedulePage;

public class TamasApplication {

	private static Tamas tamas;
	private static String filename = "data.tamas";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// start UI
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				// to do 
			}
		});

	}

	public static Tamas getTamas() {
		if (tamas == null) {
			// load model
			tamas = load();
		}
		return tamas;
	}

	public static void save() {
		PersistenceObjectStream.serialize(tamas);
	}

	public static Tamas load() {
		PersistenceObjectStream.setFilename(filename);
		tamas = (Tamas) PersistenceObjectStream.deserialize();
		// model cannot be loaded - create empty Tamas
		if (tamas == null) {
			tamas = new Tamas();
		} else {
			//do something
		}
		return tamas;
	}

	public static void setFilename(String newFilename) {
		filename = newFilename;
	}

}