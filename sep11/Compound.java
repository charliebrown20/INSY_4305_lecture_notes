//compound assignments operators
// c = c+1 or C+=1 they are the same
// d = d-1 or d-=1 they are same
// c++ it uses the currnent value of c, and then increaments c by 2
// ++c it increaments c by 1, and then uses the current value of c
// d-- it uses the current vale d, and the decrements d by 1
// --d it decrements d by 1, and then uses the current value of d

public class Compound{
  public static void main(String[] args) {

    int c=5;
    int d=3;

    System.out.printf ( " c before post increment is %d%n", c);
    System.out.printf("Post incrementing c is: %d%n", c++);
    System.out.printf("the new value of c is: %d%n", c);
    System.out.printf("c after incrementing is : %d%n", ++c);

    System.out.printf("d before post decrement is: %d%n",d);
    System.out.printf("post decrementing d is: %d%n", d--);
    System.out.printf("the new value of d is: %d%n", d);
    System.out.printf("d after decrementing is: %d%n", --d);
  }// end main
}// end class
