// creating a sentinel controlled iteration
import java.util.Scanner;

public class ClassAverage1;{
  public static void main(String[] args) {

    Scanner input = new Scanner (System.in);

    int total = 0;
    int gradeCounter = 0;

    system.out.print ("enter grade or -1 to quit");
    //-1 is the sentinel control
    int mygrade= input.nextint();
    //loop
    while (mygrade != -1){
      total = total +mygrade;
      gradeCounter= gradeCounter+1 //not for the loop, for the division

      System.out.print ("Enter grade or -1 to quit");
      mygrade= input.nextint(); // read the input
    }//close while

    if (gradeCounter !=0)
    { double average = (double) total/gradeCounter}
  }

}
