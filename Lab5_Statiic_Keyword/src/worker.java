public class worker {

    private  int salary;
    private  int lost;

    public worker(int salary, int lost){
        this.lost=lost;
        this.salary=salary;
    }

    public  int workerTotal(){
        int total = salary-lost;
        return total;
    }
}
