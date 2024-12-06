import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Car[] cars = new Car[]{
                    new Car("Audi  ",200,2000),
                    new Car(2020),
                    new Car("Toyota",2024)
            };

        try{
            for(Car car:cars){
                if(car.getYear()>2022){
                    car.setYear(2022);
                    throw new IllegalArgumentException("2022den büyük olamaz!");
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
            Factory factory= new Factory(cars);
            factory.printAllCarsInfo();


            System.out.println(factory.cars[1].getCarInfo());
            System.out.println(factory.cars[0].getCarInfo());


            try{
                factory.cars[0].setYear(2023);
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
            factory.printAllCarsInfo();

        }

        }


//In the main method, create three car objects and a factory object.
// Use different constructor to create each car object.
//Call the printAllCarsInfo() method using to print all the cars in the factory.
// getCarInfo() method should return car info.
//In setYear method, year argument cannot be bigger than 2022.
// If it is it must throw and illegal argument exception with a message.
// You should handle the exception in the main method.
