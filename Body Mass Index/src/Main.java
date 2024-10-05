import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your height(meter)?:");
        float height = input.nextFloat();
        System.out.println("What is your mass?:");
        float kg = input.nextFloat();
        System.out.println("Your body mass index is "+ bmi(height,kg));
    }

    static double bmi(float h,float kg){
        return (kg/(h*h));
    }
}