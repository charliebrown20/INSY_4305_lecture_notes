//summing the even integers from 2 to 20
// for iteration
// print the result

public class SumEven{
  public static void main(String[] args) {

    int total= 0;

    for(int counter=2; counter <=20;counter=counter +2)
    {
      total = total+counter;
    }
    System.out.printf("Sum is %d",total);

  }// end main

}
