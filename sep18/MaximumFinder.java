//creating a method with multiple parameters

import java.util.Scanner;

public class MaximumFinder {

  public static void main(String[] args) {

    Scanner input= new Scanner (System.in);

    System.out.printf("Enter three floating-point values seperated by spaces: ");

    double number1= input.nextDouble(); // read the first number1
    double number2= input.nextDouble(); // read the second number2
    double number3= input.nextDouble(); // read the third number3

    // determine maximun one
    double result= maximum(number1,number2,number3);
    // when a static method call another static method
    // in the same class
    // we do not need to use the name of the class to invoke
    // the static method

    System.out.printf("The maximun number is: %f", result);



  }// end main

  //creating a maximum method
   public static double maximum(double x, double y,double z)
   {  double mymaximum=x;

     if( y>mymaximum)
     {mymaximum=y;}

     if(z>mymaximum)
     {mymaximum=z;}

     return mymaximum;


   }// end of the method
}// end of the class
