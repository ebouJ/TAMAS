/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.24.0-dab6b48 modeling language!*/

package ca.mcgill.ecse321.TAMAS.model;

// line 16 "../../../../../TAMAS.ump"
public class Evaluation
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Evaluation Associations
  private Instructor instructor;
  private Job job;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Evaluation(Instructor aInstructor, Job aJob)
  {
    boolean didAddInstructor = setInstructor(aInstructor);
    if (!didAddInstructor)
    {
      throw new RuntimeException("Unable to create evaluation due to instructor");
    }
    if (aJob == null || aJob.getEvaluation() != null)
    {
      throw new RuntimeException("Unable to create Evaluation due to aJob");
    }
    job = aJob;
  }

  public Evaluation(Instructor aInstructor, int aNumberOfHoursForJob, int aSalaryForJob, boolean aIsTaJobForJob, boolean aIsAssignedToStudentForJob, boolean aIsAllocatedToStudentForJob, String aDescriptionForJob, String aDeadlineForJob, Course aCourseForJob, Student aJobCandidateForJob)
  {
    boolean didAddInstructor = setInstructor(aInstructor);
    if (!didAddInstructor)
    {
      throw new RuntimeException("Unable to create evaluation due to instructor");
    }
    job = new Job(aNumberOfHoursForJob, aSalaryForJob, aIsTaJobForJob, aIsAssignedToStudentForJob, aIsAllocatedToStudentForJob, aDescriptionForJob, aDeadlineForJob, aCourseForJob, this, aJobCandidateForJob);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public Instructor getInstructor()
  {
    return instructor;
  }

  public Job getJob()
  {
    return job;
  }

  public boolean setInstructor(Instructor aInstructor)
  {
    boolean wasSet = false;
    if (aInstructor == null)
    {
      return wasSet;
    }

    Instructor existingInstructor = instructor;
    instructor = aInstructor;
    if (existingInstructor != null && !existingInstructor.equals(aInstructor))
    {
      existingInstructor.removeEvaluation(this);
    }
    instructor.addEvaluation(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Instructor placeholderInstructor = instructor;
    this.instructor = null;
    placeholderInstructor.removeEvaluation(this);
    Job existingJob = job;
    job = null;
    if (existingJob != null)
    {
      existingJob.delete();
    }
  }

}