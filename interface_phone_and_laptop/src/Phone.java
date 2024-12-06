public class Phone implements Chargable,Powerable {

    public void charge(){
        System.out.println("Phone is charging.\n");
    }
    public void stopCharging(){
        System.out.println("Phone stops charging.\n");
    }
    public void powerOn(){
        System.out.println("Phone power on!\n");
    }
    public void powerOff(){
        System.out.println("Phone power off!\n");
    }

}
