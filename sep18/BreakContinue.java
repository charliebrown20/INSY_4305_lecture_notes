// break and continue statements


public class BreakContinue{
  public static void main(String[] args) {
    int count; //control variable

    for (count=1;count<=10;count++)

    { if(count==5)
    {break;}// end if
    System.out.printf("%d%n",count);
  }//end for

  for (count=1; count<=10; count++)
    {if(count==5)
      {continue;}// end if
    //skips 5 and the continues untill the loop condition
    //is satisfied
    
    System.out.printf("%d%n",count++);

    }

}// end main
}// end class
