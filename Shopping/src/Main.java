import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many peach? :");
        int peach = input.nextInt();
        System.out.print("How many apple? :");
        int apple = input.nextInt();
        System.out.print("How many tomato? :");
        int tomato = input.nextInt();
        System.out.print("How many banana? :");
        int banana= input.nextInt();
        System.out.print("How many eggplant? :");
        int eggplant = input.nextInt();
        System.out.print("Total shopping is " + total(peach,apple,tomato,banana,eggplant));
    }

    static double total(int p, int a, int t, int b, int e){
        //    Armut : 2,14 TL
        //    Elma : 3,67 TL
        //    Domates : 1,11 TL
        //    Muz: 0,95 TL
        //    Patlıcan : 5,00 TL
        return p*2.14+a*3.67+t*1.11+b*0.95+e*5;
    }
}