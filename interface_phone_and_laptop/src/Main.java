public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Laptop laptop1 = new Laptop();
        phone1.powerOn();
        laptop1.powerOn();
        phone1.charge();
        laptop1.charge();
        laptop1.stopCharging();
        laptop1.powerOff();
    }
}