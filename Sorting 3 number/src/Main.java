import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter first number(a): ");
        a= input.nextInt();
        System.out.print("Enter second number(b): ");
        b= input.nextInt();
        System.out.print("Enter third number(c): ");
        c= input.nextInt();

        if((a<b)&&(a<c)){
            if(b<c){
                System.out.println("a < b < c");
            }
            else
                System.out.println("a < c < b");
        }
        else if((b<a)&&(b<c)){
            if(a<c)
                System.out.println("b < a < c");
            else
                System.out.println("b < c < a");
        }
        else
            if(a<b)
                System.out.println("c < a < b");
            else
                System.out.println("c < b < a");
    }
}