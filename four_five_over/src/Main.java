import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n= input.nextInt();
        int sum=0;
        for(int i=1;i<=n;i*=4){
            System.out.println("for 4: " +i);
        }
        for(int i=1;i<=n;i*=5){
            System.out.println("for 5: " + i);
        }
    }
}