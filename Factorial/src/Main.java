import java.util.Scanner;

// C(n,r) = n! / (r! * (n-r)!)
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("C(n,r), Enter n: ");
        int n = input.nextInt();
        System.out.print("C(n,r), Enter r: ");
        int r = input.nextInt();
        if(n<r) throw new IllegalArgumentException();
        double result = Fac(n)/(Fac(r)*Fac(n-r));
        System.out.println(result);

    }
    public static double Fac(int x){
        if(x==0 || x== 1) return 1;

        return x*Fac(x-1);
    }

}