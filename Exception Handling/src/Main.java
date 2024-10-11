import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        try {
            System.out.println("Enter a value");
            int value =input.nextInt();

        } catch (InputMismatchException exception) {
            System.out.println(exception.getMessage());
        }


    }
}