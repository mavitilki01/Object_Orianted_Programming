public class Car {
    private String brand;
    private int maxSpeed;
    private int year;
    static int  count;

    public Car(String brand,int maxSpeed, int year){
        this.brand=brand;
        this.maxSpeed=maxSpeed;
        this.year=year;
        count++;}

    Car(String brand,int year){
        this(brand,0,year);
    }
    Car(int year){
        this("unknown",0,year);}

    public void setYear(int year){
        if(year>2022){
            throw new IllegalArgumentException("Yıl 2022 den küçük olmalı!");
        }
        this.year=year;}

    public void setMaxSpeed(int maxSpeed) {this.maxSpeed = maxSpeed;}
    public void setBrand(String brand) {this.brand = brand;}

    public int getMaxSpeed() {return maxSpeed;}
    public int getYear() {return year;}
    public String getBrand() {return brand;}

    public String getCarInfo(){
        return ("Car brand: "+ this.brand + "\t\tMax speed: "+ this.maxSpeed+ "\t\tCar year: "+this.year);}
}
