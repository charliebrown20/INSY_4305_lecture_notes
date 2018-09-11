// iteration with for
// essentials of an iteration
// 1. we must have a control varable
// 2. we must initialize the control variable
// 3. we must have a loop-continuation condition
// 4. we must increment the control variable

public class ForCounter {
  public static void main(String[] args) {

    for (int counter= 1; counter <=10; counter=counter+1)// for header statement
    //loop 10 times
    {
      System.out.printf("the counter is: %d%n", counter);

    }// end for

    //System.out.printf("the counter is: %d%n", counter);
    // counter (control variable) is restricted to be used in
    // only in that for statement, it is called variable's scope

    for(int counter=1; counter <=10; counter++)
    {
      System.out.printf("the counter is: %d%n", counter);
    }// end for

    for(int counter =1; counter <=10; ++counter)
      {
        System.out.printf("the counter is: %d%n", counter);
      }
    for(int counter=10; counter >=1; counter--)
    {
      System.out.printf("the counter is: %d%n", counter);
    }

  }// end main
}// end class
