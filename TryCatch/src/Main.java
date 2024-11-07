public class Main {
    public static void main(String[] args) {
        EncapsulatedNFT eft = new EncapsulatedNFT();
        eft.setOwner("İsranur Elcenabi");
        eft.setBalance(10089f);
        System.out.println(eft.getOwner());
        System.out.println(eft.getBalance());
    }
}