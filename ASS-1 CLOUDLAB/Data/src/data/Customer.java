
package data;

public class Customer extends Person {
   int customerNo;
   boolean onMailList;
   @Override
   public String toString() {
       return "Customer [customerNo=" + customerNo + ", onMailList=" + onMailList + "]";
   }
   public int getCustomerNo() {
       return customerNo;
   }
   public void setCustomerNo(int customerNo) {
       this.customerNo = customerNo;
   }
   public boolean isOnMailList() {
       return onMailList;
   }
   public void setOnMailList(boolean onMailList) {
       this.onMailList = onMailList;
   }
}