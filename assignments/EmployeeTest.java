// testing employee class

public class EmployeeTest{
  public static void main(String[] args) {

    Employee employee1 = new Employee ("John","Doe",100);
    Employee employee2 = new Employee ("Bonnie", "Joe",200);

    System.out.printf("\nEmployee 1 first name is: %s%n",
    employee1.getfirstName()); // using get method to get the fist name

    System.out.printf("Employee 1 last name is: %s%n",
    employee1.getlastName()); // using method to get last name

    System.out.printf("Employee 1 monthly salary is: %.2f%n",
    employee1.getmonthlySalary());// using method to get salary 

    System.out.printf("\nEmployee 2 first name is: %s%n",
    employee2.getfirstName());

    System.out.printf("Employee 2 last name is: %s%n",
    employee2.getlastName());

    System.out.printf("Employee 2 monthly salary is: %.2f%n",
    employee2.getmonthlySalary());

    // ten percent raise
    System.out.printf("\nEmployee 1 first name is: %s%n",
    employee1.getfirstName());

    System.out.printf("Employee 1 last name is: %s%n",
    employee1.getlastName());

    System.out.printf("Employee 1 monthly salary with a ten percent raise is is: %.2f%n",
    employee1.getmonthlySalary()*1.1);

    System.out.printf("\nEmployee 2 first name is: %s%n",
    employee2.getfirstName());

    System.out.printf("Employee 2 last name is: %s%n",
    employee2.getlastName());

    System.out.printf("Employee 2 monthly salary with a ten percent raise is: %.2f%n\n",
    employee2.getmonthlySalary()*1.1);
  }
}
