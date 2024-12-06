public class Laptop implements Chargable,Powerable {
    public void charge(){
        System.out.println("Laptop is charging.\n");
    }
    public void stopCharging(){
        System.out.println("Laptop stops charging.\n");
    }
    public void powerOn(){
        System.out.println("Laptop power on!\n");
    }
    public void powerOff(){
        System.out.println("Laptop power off!\n");
    }
}
