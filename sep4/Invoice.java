public class Invoice {
  private String partNumber;
  private String partDescription;
  private int quantity;
  private double pricePerItem; // instance variable

  // constructor
  public Invoice (String partNumber, String partDescription, int quantity, double prinePerItem)
  {
    this.partNumber=partNumber;
    this.partDescription=partDescription;

    //validate quantity
    if (quantity >0) {
      this.quantity=quantity;
    }// end if

    //validate pricePerItem
    if (pricePerItem >0.0) {
      this.pricePerItem=pricePerItem;
    }// end if
  }// end constructor

  // set and get methods for partNumber
  public void setPartnumber(String partNumber) {
    this.partNumber=partNumber;
  }//end set method

  public String getPartNumber () {
    return partNumber;
  }// end get method

  //set and get methods for partDescription
  public void setPartDescription (String PartDescription) {
    this.partDescription=partDescription;
  }// end set method

  public String getPartdescription () {
    return partDescription;
  }// end get method

  //set and get methods for quantity
  public void setQuantity(int quantity) {
    //validate quantity
    if (quantity > 0) {
      this.quantity = quantity;
    }
    if (quantity <0){
      this.quantity= 0;
    }// end if
  }// end set methods

  public int getQuantity () {
    return quantity;
  }// end get method

  //set and get method for pricePerItem
  public void setPricePerItem (double pricePerItem){
    //validate pricePerItem
    if (pricePerItem > 0.0){
      this.pricePerItem=pricePerItem;
    }// end if
    if(pricePerItem<0.0) {
      pricePerItem=0;
    }//end if
  }// end set method

public double getpricePerItem() {
  return pricePerItem;
}// end get method

//calculate and return Invoice amount
public double getInvoiceAmount () {
  return getpricePerItem()*getQuantity();
}// end method


}// end class
