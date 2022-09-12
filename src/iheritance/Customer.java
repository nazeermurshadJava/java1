package iheritance;

public class Customer extends MobileShop {
    String custName,imeiNumber;
    int billAmt;

    void setCustmData(String custName, int billAmt, String imeiNumber) {
        this.custName = custName;
        this.billAmt = billAmt;
        this.imeiNumber = imeiNumber;
    }

    public String toString() {
        return shopName+" "+mobileCompany+" "+model+" "+" "+custName+" "+billAmt+" "+imeiNumber;


    }
}