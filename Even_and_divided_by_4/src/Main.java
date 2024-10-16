import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sum = 0;
        do {
            System.out.println("Enter a number: ");
            n= input.nextInt();
            if(n%4==0){
                sum+=n;
            }
        }
        while(n%2==0);

        System.out.println("The sum of the multiples of four: "+ sum);
    }
}