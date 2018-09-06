//counter-contriolled interation statement
import java.util.Scanner;

public class ClassAverage {
  public static void main(String[] args) {

    Scanner input = new Scanner (System.in);

    int gradeCounter= 1; // it doesnt matter you can use any name
    int totalGrade= 0;

    // counter-controlled iteration
    while (gradeCounter <=10) {
      System.out.print ("Enter a grade:"); // you are asking a value from the user
      int mygrade= input.nextInt(); // you are going to read it and store it here

      totalGrade= totalGrade + mygrade; //update total grade
      gradeCounter= gradeCounter+1; //increase counter otherwise you will have an infine loop
    }//end while

    int myaverage= totalGrade/10; //find the average
    double myaverage = totalGrade/10;

    //display the results
    System.out.printf("Total grade is %d%n", totalGrade);
    System.out.printf("Average is %.2%d%n", myaverage); // two digets after the decimal point
  }//end main
}//end class
