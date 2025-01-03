public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }
    public boolean whoStarts(){
        double random = Math.random()*100;
        return random<=50;
    }

    void run(){
        if(checkWeight()){
            if(whoStarts()){
                Fighter temp =f1;
                f1=f2;
                f2=temp;
            }
            System.out.println("\nFirst player ==> "+ f1.name + "\n" );

            while (f1.health != 0 && f2.health != 0) {
                System.out.println("======YENİ TUR======");
                f2.health = f1.hit(f2);
                if (isWin()) {
                    break;
                }
                f1.health = f2.hit(f1);
                if (isWin()) {
                    break;
                }
                printScore();
            }
        }
        else
            System.out.println("Ağırlıklar uyuşmuyor!");
    }
    boolean checkWeight(){
        return (f1.weight>=minWeight && f1.weight<=maxWeight)&&(f2.weight>=minWeight &&f2.weight<=maxWeight);
    }
    public boolean isWin(){
        if(f1.health==0) {
            System.out.println(f2.name + " kazandı!\n");
            return true;
        }
        if(f2.health==0){
            System.out.println(f1.name + " kazandı!\n");
            return true;
        }
        return false;
    }
    void printScore(){
        System.out.println("=======SCORE========");
        System.out.println(f1.name + " kalan canı:\t" + f1.health);
        System.out.println(f2.name + " kalan canı:\t" + f2.health + "\n");
    }



}
