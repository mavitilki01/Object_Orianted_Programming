public class Main {
    public static void main(String[] args) {
        Horses zebra = new Horses("zebracık",80,12);
        Felidae cat = new Felidae("haydut",4,2);
        Rodentia crocodile = new Rodentia("Ratutuy",600,3);
        System.out.println("Total dosage: " + zebra.getDosage());
        System.out.println(zebra.getFeedSchedule());
        System.out.println("Total dosage: " + cat.getDosage());
        System.out.println(cat.getFeedSchedule());
        System.out.println("Total dosage: " + crocodile.getDosage());
        System.out.println(crocodile.getFeedSchedule());

    }
}