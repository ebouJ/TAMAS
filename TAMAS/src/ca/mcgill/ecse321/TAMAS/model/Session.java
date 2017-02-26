/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.24.0-dab6b48 modeling language!*/

package ca.mcgill.ecse321.TAMAS.model;
import java.sql.Time;

// line 22 "../../../../../TAMAS.ump"
public class Session
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Session Attributes
  private Time startTime;
  private Time endTime;
  private int sectionNumber;
  private String location;
  private boolean isLabSession;

  //Session State Machines
  public enum Weekday { Monday, Tuesday, Wednesday, Thursday, Friday }
  private Weekday weekday;

  //Session Associations
  private Course course;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Session(Time aStartTime, Time aEndTime, int aSectionNumber, String aLocation, boolean aIsLabSession, Course aCourse)
  {
    startTime = aStartTime;
    endTime = aEndTime;
    sectionNumber = aSectionNumber;
    location = aLocation;
    isLabSession = aIsLabSession;
    boolean didAddCourse = setCourse(aCourse);
    if (!didAddCourse)
    {
      throw new RuntimeException("Unable to create specificSession due to course");
    }
    setWeekday(Weekday.Monday);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setStartTime(Time aStartTime)
  {
    boolean wasSet = false;
    startTime = aStartTime;
    wasSet = true;
    return wasSet;
  }

  public boolean setEndTime(Time aEndTime)
  {
    boolean wasSet = false;
    endTime = aEndTime;
    wasSet = true;
    return wasSet;
  }

  public boolean setSectionNumber(int aSectionNumber)
  {
    boolean wasSet = false;
    sectionNumber = aSectionNumber;
    wasSet = true;
    return wasSet;
  }

  public boolean setLocation(String aLocation)
  {
    boolean wasSet = false;
    location = aLocation;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsLabSession(boolean aIsLabSession)
  {
    boolean wasSet = false;
    isLabSession = aIsLabSession;
    wasSet = true;
    return wasSet;
  }

  public Time getStartTime()
  {
    return startTime;
  }

  public Time getEndTime()
  {
    return endTime;
  }

  public int getSectionNumber()
  {
    return sectionNumber;
  }

  public String getLocation()
  {
    return location;
  }

  /**
   * else TutorialSession
   */
  public boolean getIsLabSession()
  {
    return isLabSession;
  }

  public String getWeekdayFullName()
  {
    String answer = weekday.toString();
    return answer;
  }

  public Weekday getWeekday()
  {
    return weekday;
  }

  public boolean setWeekday(Weekday aWeekday)
  {
    weekday = aWeekday;
    return true;
  }

  public Course getCourse()
  {
    return course;
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
      existingCourse.removeSpecificSession(this);
    }
    course.addSpecificSession(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Course placeholderCourse = course;
    this.course = null;
    placeholderCourse.removeSpecificSession(this);
  }


  public String toString()
  {
    String outputString = "";
    return super.toString() + "["+
            "sectionNumber" + ":" + getSectionNumber()+ "," +
            "location" + ":" + getLocation()+ "," +
            "isLabSession" + ":" + getIsLabSession()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "startTime" + "=" + (getStartTime() != null ? !getStartTime().equals(this)  ? getStartTime().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "endTime" + "=" + (getEndTime() != null ? !getEndTime().equals(this)  ? getEndTime().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "course = "+(getCourse()!=null?Integer.toHexString(System.identityHashCode(getCourse())):"null")
     + outputString;
  }
}