
public class Employee{
  private String firstName;
  private String lastName;
  private double monthlySalary; // instance variables

  // constructors
  public Employee (String firstName, String lastName, double monthlySalary)
  {
    this.firstName= firstName;
    this.lastName= lastName;

    //validating salary
    if(monthlySalary>0.0){
      this.monthlySalary=monthlySalary;
    }// end if
  }// end of constructors

  // set and get methods for firstName
  public void setfirstName(String firstName){
    this.firstName=firstName;
  }// end set method

  public String getfirstName(){
    return firstName;
  }// end get method

  // set and get method of lastName
  public void setlastName(String lastName){
    this.lastName=lastName;
  }// end set method

  public String getlastName(){
    return lastName;
  }// end get method

  // set and get method for monthlySalary
  public void setmonthlySalary(double monthlySalary){
    if(monthlySalary>0.0){
      this.monthlySalary=monthlySalary;
    }// end if
    if(monthlySalary<0.0){
      monthlySalary=0;
    }// end if
  } // end set method
  public double getmonthlySalary(){
    return monthlySalary;
  }// end get method

}
