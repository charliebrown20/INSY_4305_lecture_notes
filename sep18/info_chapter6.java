//static methods, static variables

import java.util.Scanner;

Scanner input = new Scanner (System.in);

double myvalue = input.nextDouble(); // to use this method (nextDouble) we need to create object from the class that this method knows
// the method executes in reponse to methods calls on
// specific object


double myvalue= Math.sqrt(4); // this method (sqrt) is a static method
// we do not need to create an object from the class
// these types f methods are called static or class methods

// statice variables and instance variable


public class Employee{
  private String name;
  private int age;

  .......

  Employee employee1= new Employee ("jennifer",36);
  Employee employee2= new Employee ("brad", 42);

  //each object ceates its own copy of instance variables

  private static String name;
  //each object uses the same copy of the variable

  Math.PI //constant
  public, final, static
  //final means that its values cannot change after the field
  // is initialized.
  // also the main method is a static method
  

}
