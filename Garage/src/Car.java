public class Car {
    private int id;
    private int productionYear;
    private int power;
    static int counter;
    boolean isMoving= false;

    Car(int id, int productionYear){
        this.id=id;
        this.productionYear=productionYear;
        power=0;
        counter++;
    }
    void setPower(int power){
        this.power=power;
    }
    int getProductionYear(){
        return productionYear;
    }
    int getAge(){
        return (2024-productionYear);
    }
    void startAndMove(){
        if(!isMoving){
            isMoving= true;
            System.out.println(id + ". araç harekete başladı.\n");
        }
        else System.out.println(id + ". araç zaten hareket ediyor.\n");
    }
    void stop(){
        if(isMoving){
            isMoving=false;
            System.out.println(id + ". araç durdu.\n");
        }
        else System.out.println(id +". araç zaten duruyor.\n");
    }
    @Override
    public String toString(){
        return id +" "+ productionYear + " " + power;
    }

}
