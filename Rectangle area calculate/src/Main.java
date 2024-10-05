import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c, area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first edge:");
        a=input.nextInt();
        System.out.print("Enter second edge:");
        b=input.nextInt();
        System.out.print("Enter third edge:");
        c=input.nextInt();
        System.out.println("Area of rectangle is:"+ area(a,b,c));

    }
    static double area(int a, int b, int c){
        float u =(a+b+c)/2;
        return Math.sqrt((u*(u-a)*(u-b)*(u-c)));
    }
}