// SellingPrice.java
// input sales revenue int
// input total number of products sold int
// calculate and display the selling price
// print total sales revenue
// total number of products sold
// combined selling price

 import java.util.Scanner;// importing the scanner class

 public class SellingPrice{
   public static void main(String[] args) {

     Scanner input = new Scanner (System.in);

     // initializaiton phase
     int total_sales_revenue = 0;
     int total_products_sold = 0;
    // int combined_selling_price = 0;
     int year_counter = 0;

     // processing phase
     // asking for sale revenue
     System.out.print("Enter sales revenue or -1 to quit:");
     int sale_revenue = input.nextInt();

     if(sale_revenue != -1){
     // promt for total number of products sold
     System.out.print("Enter number of products sold:");
     int products_sold = input.nextInt();

     double sell_price = (double) sale_revenue / products_sold; // selling price
     System.out.printf("Selling price for the first year is $%.2f%n",sell_price);
      }
      else{
        break
      }

     // loop until sentinel values read from user
     while (sale_revenue != -1){


       total_sales_revenue = total_sales_revenue + sale_revenue;
       total_products_sold = total_products_sold + products_sold; //total count of product sold
       //combined_selling_price = combined_selling_price + selling_price; combined price (to be average)
       year_counter = year_counter + 1; // increment counter


       System.out.print("Enter sales revenue or -1 to quit: ");
       sale_revenue = input.nextInt();
       while (sale_revenue != -1){
       System.out.print("Enter total number of products sold: " ); // promt for number sold
       products_sold = input.nextInt();

       sell_price = (double) sale_revenue / products_sold; // selling price
       System.out.printf("Selling price for the second year is $%.2f%n",sell_price);
     }//

     }// end 2nd while
   }// end 1st while

     // and least one year was entered
     if (year_counter != 0){

  //     double average_selling = (double) combined_selling_price / total_products_sold;
       double average_selling = (double) total_sales_revenue / total_products_sold;

       System.out.printf("Total sales revenue is $%.2f%n", total_sales_revenue);// Total sales revenue
       System.out.printf("Total number of products sold is %.2f%n", total_products_sold);// Total number of products sold
       System.out.printf("combined selling price is $%.2f%n", average_selling);// combined selling price
     }
     else {
       System.out.println("No values were entered");
     }// end if loop





   }// end main
 }// end class
