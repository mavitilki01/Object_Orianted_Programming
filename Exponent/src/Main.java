import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total=1;
        System.out.print("Enter a number: ");
        int x = input.nextInt();
        System.out.print("Enter a exponent number: ");
        int y= input.nextInt();

        for(y=y;y>0;y--){
            total*=x;
        }
        System.out.println(total);
    }
}