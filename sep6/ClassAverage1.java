// creating a sentinel controlled iteration
import java.util.Scanner;

public class ClassAverage1 {
  public static void main(String[] args) {

    Scanner input = new Scanner (System.in);

    int total = 0;
    int gradeCounter = 0;

    System.out.print ("enter grade or -1 to quit");
    //-1 is the sentinel control
    int mygrade= input.nextInt();
    //loop
    while (mygrade != -1){
      total = total +mygrade;
      gradeCounter= gradeCounter+1; //not for the loop, for the division

      System.out.print ("Enter grade or -1 to quit");
      mygrade= input.nextInt(); // read the input
    }//close while

    if (gradeCounter !=0)
    { double average = (double) total/gradeCounter;

    System.out.printf("The total is %d, the total number is %d, the average is %.2f%n", total,gradeCounter, average);
    }//end if

    else{
      System.out.print("no grades entered");
    }
  }//end main
}
