
// reads three integers
// determines if interger is even or odd
// print result
import java.util.Scanner; // importing the scanner tool

public class OddEven{
  public static void main(String[] args) {

  Scanner input = new Scanner (System.in);

  System.out.print("Enter three integers to be determined if even or odd:\n"); // asking the user to input three integers

  int number1 = input.nextInt(); // the input of the first integer
  int number2 = input.nextInt(); // input of the second integer
  int number3 = input.nextInt(); // input of third integer

  // if statements determine if integer is divisable by 2
  // if true, then it is even
  // else, it is odd

  if (number1 %2 ==  0)
  {
    System.out.printf(number1 + " Is an even integer\n");

  }
  else{
    System.out.printf(number1 + " Is an odd integer\n");
  }
  if (number2 %2 ==  0)
  {
    System.out.printf("%d Is an even integer\n", number2);

  }
  else{
    System.out.printf("%d Is an odd integer\n", number2);
  }
  if (number3 %2 ==  0)
  {
    System.out.printf("%d Is an even integer\n", number3);

  }
  else{
    System.out.printf("%d Is an odd integer\n", number3);
  }

}
}
