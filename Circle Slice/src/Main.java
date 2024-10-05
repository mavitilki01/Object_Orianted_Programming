import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r,a;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius:");
        r= input.nextInt();
        System.out.print("Enter angle:");
        a= input.nextInt();
        System.out.println("The area of circle slice is "+area(r,a));


    }
    static double area(int r, int a){
        return (3.14f*r*r*a)/360;
    }

}