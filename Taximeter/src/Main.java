import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many kilometer do you go?= ");
        int km = input.nextInt();
        System.out.println("Your total price is: "+taxi(km));
    }
    static double taxi(int km){
        double total = km*2.2+10;
        if(total<20){
            return 20.0;
        }
        return total;
    }
}