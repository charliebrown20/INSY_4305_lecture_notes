//secure random number generation

import java.security.SecureRandom;
//to creaste non-deterministic random numbers that cannot be predicted

public class RandomInt{
  public static void main(String[] args) {


    SecureRandom myRandom= new SecureRandom();
    //creating an object from the class SecureRandom


    //loop
    for(int counter=1; counter<=20; counter++)

    { int face= 1+ myRandom.nextInt(6);
      //0,1,2,3,4,5 (myRandom.nextInt())
      //1 is the shifting value, 1,2,3,4,5,6 (will generate)

      System.out.printf("the number is: %d%n", face);

    }// end loop
  }// end main
}// end class
