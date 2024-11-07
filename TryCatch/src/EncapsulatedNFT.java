public class EncapsulatedNFT {
   private double balance;
   private String owner;

   String getOwner(){
       return owner;
   }
   void setOwner(String owner){
       this.owner=owner;
   }
   double getBalance(){
       return balance;
   }
   void setBalance(double balance){
           if(balance< 0 || balance> 10000){
               throw new IllegalArgumentException("Hatalı miktar girişi!");
           }
           this.balance=balance;
   }

}
