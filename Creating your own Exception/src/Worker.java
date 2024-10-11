public class Worker {

    static int counter;
    private String name;
    private float salary;


    public Worker(String name, float salary) {
        this.name = name;
        this.salary = salary;
        counter++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void getName() {
        System.out.println("Name is " + name);
    }

    public void getSalary() {
        System.out.println("Salary is " + salary);
    }

}

