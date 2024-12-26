public class Rodentia extends Animal{
    public Rodentia(String speciesName,int weight,int age){
        super(speciesName,weight,age);
    }
    @Override
    public double getDosage(){
        return 300;
    }

    @Override
    public String getFeedSchedule(){
        return "Kemirgen yedi.";
    }

}
