public class Garage {
    Car[] cars;

    Garage(Car[] cars){
        this.cars=cars;
    }
    void printCarsOlderThan(int age){
        int i;
        for(i=0;i<4;i++){
            if(cars[i].getAge()>=age)
                System.out.println(cars[i].toString());
        }

    }
}
