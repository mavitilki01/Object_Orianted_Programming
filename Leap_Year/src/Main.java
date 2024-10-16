import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter year: ");
        Scanner input = new Scanner(System.in);
        int year= input.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.printf("%d is a leap year.", year);
                }
                else
                    System.out.printf("%d is not a leap year.", year);
            }
            else
                System.out.printf("%d is a leap year.", year);
        }
        else
            System.out.printf("%d is not a leap year.", year);
    }
}