import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number= input.nextInt();
        int x= Minus(number);
        Plus(number, x);
    }
    public static int Minus(int number){
        if(number<=0) return number;
        System.out.print(number + " ");
        return Minus(number-5) ;

    }
    public static int Plus(int number, int x){
        System.out.print(x + " ");
        if(number==x) return number;

        return Plus(number,x+5) ;
    }

}