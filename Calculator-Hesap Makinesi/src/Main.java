import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int x,y;
        System.out.println("Enter first number:");
        x= input.nextInt();
        System.out.println("Enter second number:");
        y= input.nextInt();
        System.out.print("Enter the code which operation do you want? \n1-Addition\n2-Subtraction\n3-Multiplication\n4-Division\n" );
        int choose = input.nextInt();
        switch(choose) {
            case 1:
                System.out.println("Total: " + (x+y)); break;
            case 2:
                System.out.println("Total: " + (x-y)); break;
            case 3:
                System.out.println("Total: " + (x*y));
                break;
            case 4:
                System.out.println("Total: " + (x/y));
                break;
            default:
            System.out.println("Please enter a valid number.");

            }
        }
    }
