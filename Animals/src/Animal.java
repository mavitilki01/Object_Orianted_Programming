abstract class Animal {
    private String speciesName;
    private int weight;
    private int age;

    public Animal(String speciesName,int weight,int age){
        this.speciesName=speciesName;
        this.weight=weight;
        this.age=age;
    }
    public abstract double getDosage();
    public abstract String getFeedSchedule();

}
