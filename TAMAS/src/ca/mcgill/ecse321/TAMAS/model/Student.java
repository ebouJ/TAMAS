/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.24.0-dab6b48 modeling language!*/

package ca.mcgill.ecse321.TAMAS.model;
import java.util.*;

// line 31 "../../../../../TAMAS.ump"
public class Student extends Person
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Student Attributes
  private String studentId;
  private boolean isGrad;

  //Student Associations
  private List<Job> offeredJob;
  private List<JobApplication> jobApplications;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Student(String aName, String aUsername, String aPassword, String aStudentId, boolean aIsGrad)
  {
    super(aName, aUsername, aPassword);
    studentId = aStudentId;
    isGrad = aIsGrad;
    offeredJob = new ArrayList<Job>();
    jobApplications = new ArrayList<JobApplication>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setStudentId(String aStudentId)
  {
    boolean wasSet = false;
    studentId = aStudentId;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsGrad(boolean aIsGrad)
  {
    boolean wasSet = false;
    isGrad = aIsGrad;
    wasSet = true;
    return wasSet;
  }

  public String getStudentId()
  {
    return studentId;
  }

  public boolean getIsGrad()
  {
    return isGrad;
  }

  public Job getOfferedJob(int index)
  {
    Job aOfferedJob = offeredJob.get(index);
    return aOfferedJob;
  }

  public List<Job> getOfferedJob()
  {
    List<Job> newOfferedJob = Collections.unmodifiableList(offeredJob);
    return newOfferedJob;
  }

  public int numberOfOfferedJob()
  {
    int number = offeredJob.size();
    return number;
  }

  public boolean hasOfferedJob()
  {
    boolean has = offeredJob.size() > 0;
    return has;
  }

  public int indexOfOfferedJob(Job aOfferedJob)
  {
    int index = offeredJob.indexOf(aOfferedJob);
    return index;
  }

  public JobApplication getJobApplication(int index)
  {
    JobApplication aJobApplication = jobApplications.get(index);
    return aJobApplication;
  }

  public List<JobApplication> getJobApplications()
  {
    List<JobApplication> newJobApplications = Collections.unmodifiableList(jobApplications);
    return newJobApplications;
  }

  public int numberOfJobApplications()
  {
    int number = jobApplications.size();
    return number;
  }

  public boolean hasJobApplications()
  {
    boolean has = jobApplications.size() > 0;
    return has;
  }

  public int indexOfJobApplication(JobApplication aJobApplication)
  {
    int index = jobApplications.indexOf(aJobApplication);
    return index;
  }

  public static int minimumNumberOfOfferedJob()
  {
    return 0;
  }

  public static int maximumNumberOfOfferedJob()
  {
    return 3;
  }

  public Job addOfferedJob(int aNumberOfHours, int aSalary, boolean aIsTaJob, boolean aIsAssignedToStudent, boolean aIsAllocatedToStudent, String aDescription, String aDeadline, Course aCourse, Evaluation aEvaluation)
  {
    if (numberOfOfferedJob() >= maximumNumberOfOfferedJob())
    {
      return null;
    }
    else
    {
      return new Job(aNumberOfHours, aSalary, aIsTaJob, aIsAssignedToStudent, aIsAllocatedToStudent, aDescription, aDeadline, aCourse, aEvaluation, this);
    }
  }

  public boolean addOfferedJob(Job aOfferedJob)
  {
    boolean wasAdded = false;
    if (offeredJob.contains(aOfferedJob)) { return false; }
    if (numberOfOfferedJob() >= maximumNumberOfOfferedJob())
    {
      return wasAdded;
    }

    Student existingJobCandidate = aOfferedJob.getJobCandidate();
    boolean isNewJobCandidate = existingJobCandidate != null && !this.equals(existingJobCandidate);
    if (isNewJobCandidate)
    {
      aOfferedJob.setJobCandidate(this);
    }
    else
    {
      offeredJob.add(aOfferedJob);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeOfferedJob(Job aOfferedJob)
  {
    boolean wasRemoved = false;
    //Unable to remove aOfferedJob, as it must always have a jobCandidate
    if (!this.equals(aOfferedJob.getJobCandidate()))
    {
      offeredJob.remove(aOfferedJob);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  public boolean addOfferedJobAt(Job aOfferedJob, int index)
  {  
    boolean wasAdded = false;
    if(addOfferedJob(aOfferedJob))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfOfferedJob()) { index = numberOfOfferedJob() - 1; }
      offeredJob.remove(aOfferedJob);
      offeredJob.add(index, aOfferedJob);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveOfferedJobAt(Job aOfferedJob, int index)
  {
    boolean wasAdded = false;
    if(offeredJob.contains(aOfferedJob))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfOfferedJob()) { index = numberOfOfferedJob() - 1; }
      offeredJob.remove(aOfferedJob);
      offeredJob.add(index, aOfferedJob);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addOfferedJobAt(aOfferedJob, index);
    }
    return wasAdded;
  }

  public static int minimumNumberOfJobApplications()
  {
    return 0;
  }

  public static int maximumNumberOfJobApplications()
  {
    return 3;
  }

  public JobApplication addJobApplication(String aExperience, Job aAppliedJob)
  {
    if (numberOfJobApplications() >= maximumNumberOfJobApplications())
    {
      return null;
    }
    else
    {
      return new JobApplication(aExperience, this, aAppliedJob);
    }
  }

  public boolean addJobApplication(JobApplication aJobApplication)
  {
    boolean wasAdded = false;
    if (jobApplications.contains(aJobApplication)) { return false; }
    if (numberOfJobApplications() >= maximumNumberOfJobApplications())
    {
      return wasAdded;
    }

    Student existingApplicant = aJobApplication.getApplicant();
    boolean isNewApplicant = existingApplicant != null && !this.equals(existingApplicant);
    if (isNewApplicant)
    {
      aJobApplication.setApplicant(this);
    }
    else
    {
      jobApplications.add(aJobApplication);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeJobApplication(JobApplication aJobApplication)
  {
    boolean wasRemoved = false;
    //Unable to remove aJobApplication, as it must always have a applicant
    if (!this.equals(aJobApplication.getApplicant()))
    {
      jobApplications.remove(aJobApplication);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  public boolean addJobApplicationAt(JobApplication aJobApplication, int index)
  {  
    boolean wasAdded = false;
    if(addJobApplication(aJobApplication))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfJobApplications()) { index = numberOfJobApplications() - 1; }
      jobApplications.remove(aJobApplication);
      jobApplications.add(index, aJobApplication);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveJobApplicationAt(JobApplication aJobApplication, int index)
  {
    boolean wasAdded = false;
    if(jobApplications.contains(aJobApplication))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfJobApplications()) { index = numberOfJobApplications() - 1; }
      jobApplications.remove(aJobApplication);
      jobApplications.add(index, aJobApplication);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addJobApplicationAt(aJobApplication, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    for(int i=offeredJob.size(); i > 0; i--)
    {
      Job aOfferedJob = offeredJob.get(i - 1);
      aOfferedJob.delete();
    }
    for(int i=jobApplications.size(); i > 0; i--)
    {
      JobApplication aJobApplication = jobApplications.get(i - 1);
      aJobApplication.delete();
    }
    super.delete();
  }


  public String toString()
  {
    String outputString = "";
    return super.toString() + "["+
            "studentId" + ":" + getStudentId()+ "," +
            "isGrad" + ":" + getIsGrad()+ "]"
     + outputString;
  }
}