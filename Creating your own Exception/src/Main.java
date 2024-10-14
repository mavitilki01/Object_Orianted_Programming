import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Worker worker3 = new Worker("Cemil", 50000);
        Worker worker4 = new Worker("Suat", 20000);
        Worker worker5 = new Worker("Yusuf", 42000);
        Worker worker2 = new Worker("Orhan", 17500);

        Scanner input = new Scanner(System.in);

        worker2.setName("Şerif");
        System.out.println("Enter worker2's salary value:");
        float salary= input.nextFloat();

        try{
            if(salary<0){
                throw new InputMismatchException("salary amount must be greater than zero");
            }
            worker2.setSalary(salary);
        }
        catch(InputMismatchException exception){
            System.out.println(exception.getMessage());
        }

        worker2.getName();
        worker2.getSalary();






    }
}