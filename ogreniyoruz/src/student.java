import java.util.Scanner;

public class student {

    String name;
    int id;
    int midterm;
    int Final;
    float result;

    void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name:");
        name = scanner.nextLine();
        System.out.println("Enter student id:");
        id = scanner.nextInt();
        System.out.println("Enter student midterm:");
        midterm = scanner.nextInt();
        System.out.println("Enter student final:");
        Final = scanner.nextInt();

    }
    float calculate(int mid, int fin){
        result = mid*0.4f + fin*0.6f;
        return(result);
    }

    void display(){
        System.out.println("Student name is "+ name);
        System.out.println("Student id is " + id);
        System.out.println("Student midterm is " + midterm);
        System.out.println("Student final is " + Final);
        System.out.println("Average is " + result);

    }
}
