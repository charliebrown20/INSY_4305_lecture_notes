// testing the static method

public class TestStatic {
  public static void main(String[] args) {

    double myvalue= MaximumFinder.maximum(10.11,21.11,15.11);
    // maximum is a static method
    // we do not need to create an object from the class
    //MaximumFinder to call ths method

    //but, this method is in the different class
    //so, we need to use classname to invoke this method

    System.out.printf("The maximum number is: %f\n", myvalue);
  }// end main
} // end class
