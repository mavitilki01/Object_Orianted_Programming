import java.util.Scanner;

public class account {
        private double balance;
        private String ownerName;
        private final String password ="5901"; //final= sabit değişken değiştirilemeyen


        public account(String ownerName,double balance){
            this.ownerName=ownerName;
            this.balance=balance;
        }
        double add(double amount){
            balance=balance+amount;
            return balance;
        }
        double withdraw(double amount){
            int i=0;
            while(i<3){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter your password");
                String password = scanner.next();

                if (this.password == password) {
                    if(amount>balance){
                        System.out.println("There is not enough money");
                        return balance;
                    }
                    balance=balance-amount;
                    System.out.println("Withdraw complated \nNew balance=" + balance);
                    return balance;
                }
                else{
                System.out.println("Wrong password. Try again!");
                i++;
            }
                if(i==3){
                    System.out.println("Entered 3 wrong password. System blocked!!!");
                    return 0;
                }
            }

            return balance;
        }
        public void setOwnerName(String name){
            ownerName=name;
        }
        public double getBalance(){
            System.out.println("Amount of balance: " + balance);
            return balance;
        }
        public String getOwnerName(){
            return ownerName;
        }
    }

