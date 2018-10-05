// Write an application that reads two integers, determines whether the first is a
// multiple of the second and prints the result.Multiple.java

import java.util.Scanner; // importing the scanner tool

public class Multiple{
  public static void main(String[] args) {

    Scanner input = new Scanner (System.in);

    System.out.print("Please enter two values to determine if the value of the first input is multiple of the second input:\n");

    int a = input.nextInt(); // input of the first integer
    int b = input.nextInt(); // input of the second integer

    if (b %a == 0)// determines if 'a' is a multiple of b
      {
        System.out.printf("%d is a multiple of %d%n", a,b);
      }
    else{
      System.out.printf("%d is not a multiple of %d%n",a,b);
    }
  }
}
