public class Felidae extends Animal {
    public Felidae(String speciesName,int weight,int age){
        super(speciesName,weight,age);
    }

    @Override
    public String getFeedSchedule() {
        return "Kediler yedi.";
    }

    @Override
    public double getDosage() {
        return 150;
    }
}
