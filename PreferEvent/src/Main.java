import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Whats temperature?");
        int temp = input.nextInt();
        if(temp<5){
            System.out.println("You can ski.");
        }
        else if(temp<15){
            System.out.println("You can go to the cinema.");
        }
        else if(temp<25){
            System.out.println("You can go to the picnik.");
        }
        else
            System.out.println("You can swim.");

    }
}