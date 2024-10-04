public class Main {
    public static void main(String[] args) {
    account account1 = new account("Ally Anderson",10000f);

    System.out.println(account1.getOwnerName());
    account1.getBalance();
    account1.add(5000f);
    account1.getBalance();
    account1.withdraw(3000f);
    account1.setOwnerName("Sally Anderson");
    System.out.println(account1.getOwnerName());
    account1.getBalance();



    }
}