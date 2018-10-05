// Write an application that inputs five numbers and prints user inputs and
// determines and prints the number of negative numbers input, the number of
// positive numbers input, and the number of zero input.

import java.util.Scanner; // importing scanner tool

public class NegativePositive{
  public static void main(String[] args) {

    Scanner input = new Scanner (System.in);

    // initial counter
    int NumOfPositives = 0;
    int NumOfNegatives = 0;
    int NumOfZeros = 0;

    System.out.print("Enter five numbers:\n"); // asking for an input of values
    int num1 = input.nextInt(); // first input

    // determinig if value is positive, negative, or zero
    if(num1 == 0){
      NumOfZeros = NumOfZeros +1;
    }
    else if(num1 >0){
      NumOfPositives = NumOfPositives +1;
    }
    else{
      NumOfNegatives = NumOfNegatives +1;
    }

    // repeated with second value
    int num2 = input.nextInt();
    if(num2 == 0){
      NumOfZeros = NumOfZeros +1;
    }
    else if(num2 >0){
      NumOfPositives = NumOfPositives +1;
    }
    else{
      NumOfNegatives = NumOfNegatives +1;
    }


    int num3 = input.nextInt(); // third input
    if(num3 == 0){
      NumOfZeros = NumOfZeros +1;
    }
    else if(num3 >0){
      NumOfPositives = NumOfPositives +1;
    }
    else{
      NumOfNegatives = NumOfNegatives +1;
    }

    int num4 = input.nextInt(); // fourth input
    if(num4 == 0){
      NumOfZeros = NumOfZeros +1;
    }
    else if(num4 >0){
      NumOfPositives = NumOfPositives +1;
    }
    else{
      NumOfNegatives = NumOfNegatives +1;
    }

    int num5 = input.nextInt(); // fifth input
    if(num5 == 0){
      NumOfZeros = NumOfZeros +1;
    }
    else if(num5 >0){
      NumOfPositives = NumOfPositives +1;
    }
    else{
      NumOfNegatives = NumOfNegatives +1;
    }

    // printing out the values that were entered
    System.out.printf("The list of numbers entered: %d %d %d %d %d\n", num1, num2,num3,num4,num5);
    System.out.print("From the list");

    // printing the number of negative
    System.out.printf("Number of negative inputs: %d\n", NumOfNegatives);

    // printing the number of positive
    System.out.printf("Number of positive inputs: %d\n", NumOfPositives);

    // printing the number of number of zeros 
    System.out.printf("Number of zero inputs: %d\n", NumOfZeros);


  }
}
