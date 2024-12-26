public class Horses extends Animal {


    public Horses(String speciesName, int weight, int age) {
        super(speciesName, weight, age);
    }

    @Override
    public double getDosage() {
        return 200;
    }

    @Override
    public String getFeedSchedule() {
        return "Atlar yedi.";
    }
}
