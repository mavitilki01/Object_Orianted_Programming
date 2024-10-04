public class Worker {

    String name;
    int socialSecurityNumber;
    float wage;
    int workingHours;

    public Worker(String wName, int id, float Wage, int hours ){
        name = wName;
        socialSecurityNumber =id;
        wage = Wage;
        workingHours =  hours;

    }
    public void displayInfo() {
        System.out.println("Worker name:" + name + "Worker Social Number: " + socialSecurityNumber);
    }
    public void displaySalary(){
        float salary;
        salary= wage*workingHours;
        System.out.println("Worker's salary: " + salary);
    }
}
