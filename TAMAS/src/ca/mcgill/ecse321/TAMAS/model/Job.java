/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.24.0-dab6b48 modeling language!*/

package ca.mcgill.ecse321.TAMAS.model;
import java.util.*;

// line 58 "../../../../../TAMAS.ump"
public class Job
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final int MIN_HOURS = 45;
  public static final int MAX_HOURS = 180;
  private static int nextJobId = 1;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Job Attributes
  private int numberOfHours;
  private int salary;
  private boolean isTaJob;
  private boolean isAssignedToStudent;
  private boolean isAllocatedToStudent;
  private String description;
  private String deadline;

  //Autounique Attributes
  private int jobId;

  //Job State Machines
  public enum JobState { IsPosted, AppliedTo, AssignedStudentTo, AssignmentFinalized }
  private JobState jobState;

  //Job Associations
  private Course course;
  private Evaluation evaluation;
  private Student jobCandidate;
  private List<JobApplication> jobApplications;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Job(int aNumberOfHours, int aSalary, boolean aIsTaJob, boolean aIsAssignedToStudent, boolean aIsAllocatedToStudent, String aDescription, String aDeadline, Course aCourse, Evaluation aEvaluation, Student aJobCandidate)
  {
    numberOfHours = aNumberOfHours;
    salary = aSalary;
    isTaJob = aIsTaJob;
    isAssignedToStudent = aIsAssignedToStudent;
    isAllocatedToStudent = aIsAllocatedToStudent;
    description = aDescription;
    deadline = aDeadline;
    jobId = nextJobId++;
    boolean didAddCourse = setCourse(aCourse);
    if (!didAddCourse)
    {
      throw new RuntimeException("Unable to create job due to course");
    }
    if (aEvaluation == null || aEvaluation.getJob() != null)
    {
      throw new RuntimeException("Unable to create Job due to aEvaluation");
    }
    evaluation = aEvaluation;
    boolean didAddJobCandidate = setJobCandidate(aJobCandidate);
    if (!didAddJobCandidate)
    {
      throw new RuntimeException("Unable to create offeredJob due to jobCandidate");
    }
    jobApplications = new ArrayList<JobApplication>();
    setJobState(JobState.IsPosted);
  }

  public Job(int aNumberOfHours, int aSalary, boolean aIsTaJob, boolean aIsAssignedToStudent, boolean aIsAllocatedToStudent, String aDescription, String aDeadline, Course aCourse, Instructor aInstructorForEvaluation, Student aJobCandidate)
  {
    numberOfHours = aNumberOfHours;
    salary = aSalary;
    isTaJob = aIsTaJob;
    isAssignedToStudent = aIsAssignedToStudent;
    isAllocatedToStudent = aIsAllocatedToStudent;
    description = aDescription;
    deadline = aDeadline;
    jobId = nextJobId++;
    boolean didAddCourse = setCourse(aCourse);
    if (!didAddCourse)
    {
      throw new RuntimeException("Unable to create job due to course");
    }
    evaluation = new Evaluation(aInstructorForEvaluation, this);
    boolean didAddJobCandidate = setJobCandidate(aJobCandidate);
    if (!didAddJobCandidate)
    {
      throw new RuntimeException("Unable to create offeredJob due to jobCandidate");
    }
    jobApplications = new ArrayList<JobApplication>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setNumberOfHours(int aNumberOfHours)
  {
    boolean wasSet = false;
    numberOfHours = aNumberOfHours;
    wasSet = true;
    return wasSet;
  }

  public boolean setSalary(int aSalary)
  {
    boolean wasSet = false;
    salary = aSalary;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsTaJob(boolean aIsTaJob)
  {
    boolean wasSet = false;
    isTaJob = aIsTaJob;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsAssignedToStudent(boolean aIsAssignedToStudent)
  {
    boolean wasSet = false;
    isAssignedToStudent = aIsAssignedToStudent;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsAllocatedToStudent(boolean aIsAllocatedToStudent)
  {
    boolean wasSet = false;
    isAllocatedToStudent = aIsAllocatedToStudent;
    wasSet = true;
    return wasSet;
  }

  public boolean setDescription(String aDescription)
  {
    boolean wasSet = false;
    description = aDescription;
    wasSet = true;
    return wasSet;
  }

  public boolean setDeadline(String aDeadline)
  {
    boolean wasSet = false;
    deadline = aDeadline;
    wasSet = true;
    return wasSet;
  }

  public int getNumberOfHours()
  {
    return numberOfHours;
  }

  public int getSalary()
  {
    return salary;
  }

  /**
   * else GraderJob
   */
  public boolean getIsTaJob()
  {
    return isTaJob;
  }

  public boolean getIsAssignedToStudent()
  {
    return isAssignedToStudent;
  }

  /**
   * When finalized
   */
  public boolean getIsAllocatedToStudent()
  {
    return isAllocatedToStudent;
  }

  public String getDescription()
  {
    return description;
  }

  public String getDeadline()
  {
    return deadline;
  }

  public int getJobId()
  {
    return jobId;
  }

  public String getJobStateFullName()
  {
    String answer = jobState.toString();
    return answer;
  }

  public JobState getJobState()
  {
    return jobState;
  }

  public boolean setJobState(JobState aJobState)
  {
    jobState = aJobState;
    return true;
  }

  public Course getCourse()
  {
    return course;
  }

  public Evaluation getEvaluation()
  {
    return evaluation;
  }

  public Student getJobCandidate()
  {
    return jobCandidate;
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

  public boolean setCourse(Course aCourse)
  {
    boolean wasSet = false;
    if (aCourse == null)
    {
      return wasSet;
    }

    Course existingCourse = course;
    course = aCourse;
    if (existingCourse != null && !existingCourse.equals(aCourse))
    {
      existingCourse.removeJob(this);
    }
    course.addJob(this);
    wasSet = true;
    return wasSet;
  }

  public boolean setJobCandidate(Student aJobCandidate)
  {
    boolean wasSet = false;
    //Must provide jobCandidate to offeredJob
    if (aJobCandidate == null)
    {
      return wasSet;
    }

    //jobCandidate already at maximum (3)
    if (aJobCandidate.numberOfOfferedJob() >= Student.maximumNumberOfOfferedJob())
    {
      return wasSet;
    }
    
    Student existingJobCandidate = jobCandidate;
    jobCandidate = aJobCandidate;
    if (existingJobCandidate != null && !existingJobCandidate.equals(aJobCandidate))
    {
      boolean didRemove = existingJobCandidate.removeOfferedJob(this);
      if (!didRemove)
      {
        jobCandidate = existingJobCandidate;
        return wasSet;
      }
    }
    jobCandidate.addOfferedJob(this);
    wasSet = true;
    return wasSet;
  }

  public static int minimumNumberOfJobApplications()
  {
    return 0;
  }

  public JobApplication addJobApplication(String aExperience, Student aApplicant)
  {
    return new JobApplication(aExperience, aApplicant, this);
  }

  public boolean addJobApplication(JobApplication aJobApplication)
  {
    boolean wasAdded = false;
    if (jobApplications.contains(aJobApplication)) { return false; }
    Job existingAppliedJob = aJobApplication.getAppliedJob();
    boolean isNewAppliedJob = existingAppliedJob != null && !this.equals(existingAppliedJob);
    if (isNewAppliedJob)
    {
      aJobApplication.setAppliedJob(this);
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
    //Unable to remove aJobApplication, as it must always have a appliedJob
    if (!this.equals(aJobApplication.getAppliedJob()))
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
    Course placeholderCourse = course;
    this.course = null;
    placeholderCourse.removeJob(this);
    Evaluation existingEvaluation = evaluation;
    evaluation = null;
    if (existingEvaluation != null)
    {
      existingEvaluation.delete();
    }
    Student placeholderJobCandidate = jobCandidate;
    this.jobCandidate = null;
    placeholderJobCandidate.removeOfferedJob(this);
    for(int i=jobApplications.size(); i > 0; i--)
    {
      JobApplication aJobApplication = jobApplications.get(i - 1);
      aJobApplication.delete();
    }
  }


  public String toString()
  {
    String outputString = "";
    return super.toString() + "["+
            "jobId" + ":" + getJobId()+ "," +
            "numberOfHours" + ":" + getNumberOfHours()+ "," +
            "salary" + ":" + getSalary()+ "," +
            "isTaJob" + ":" + getIsTaJob()+ "," +
            "isAssignedToStudent" + ":" + getIsAssignedToStudent()+ "," +
            "isAllocatedToStudent" + ":" + getIsAllocatedToStudent()+ "," +
            "description" + ":" + getDescription()+ "," +
            "deadline" + ":" + getDeadline()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "course = "+(getCourse()!=null?Integer.toHexString(System.identityHashCode(getCourse())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "evaluation = "+(getEvaluation()!=null?Integer.toHexString(System.identityHashCode(getEvaluation())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "jobCandidate = "+(getJobCandidate()!=null?Integer.toHexString(System.identityHashCode(getJobCandidate())):"null")
     + outputString;
  }
}