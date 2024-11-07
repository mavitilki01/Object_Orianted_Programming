public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[]{
           new Car(1,2022),
           new Car(2,2000),
           new Car(3,1992),
           new Car(4,2004),
        };
        Garage garage = new Garage(cars);
        garage.cars[0].setPower(563);
        garage.cars[1].setPower(1000);
        garage.cars[2].setPower(300);
        garage.cars[3].setPower(100);

        garage.printCarsOlderThan(0);

        System.out.println("Number of cars in the garage: " + Car.counter);

        cars[2].startAndMove();
        cars[2].stop();
        cars[1].startAndMove();
    }
}