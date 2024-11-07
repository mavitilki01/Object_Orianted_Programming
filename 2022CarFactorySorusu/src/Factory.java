public class Factory {
    Car[] cars;


    Factory(Car[] cars){
        this.cars=cars;
    }
    public void printAllCarsInfo(){

        for(Car car: cars){
            System.out.println(car.getCarInfo());
        }
    }
}

