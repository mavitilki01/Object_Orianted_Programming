import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a number");
        int sum=0,k=0;
        int n =input.nextInt();
        for(int i=1;i<n;i++){
            if(i%3==0 && i%4==0){
                sum+=i;
                k++;
            }
        }
        if(k!=0){
            float average=sum/k;
            System.out.println("The average is " +average);
        }
        else
            System.out.println("There is not any number in that range");

    }
}