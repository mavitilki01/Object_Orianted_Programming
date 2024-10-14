import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float mat,phys,turk,chem,mus;
        System.out.print("Math grade:");      mat = input.nextFloat();
        System.out.print("Physic grade:");    phys= input.nextFloat();
        System.out.print("Turkish grade:");   turk= input.nextFloat();
        System.out.print("Chemistry grade:"); chem= input.nextFloat();
        System.out.print("Music grade:");     mus = input.nextFloat();

        double average=0;
        int i =0;
        if(mat>=0 && mat<=100){
            average+=mat;
            i++;
        }
        if(phys>=0 && phys<=100){
            average+=phys;
            i++;
        }
        if(turk>=0 && turk<=100){
            average+=turk;
            i++;
        }
        if(chem>=0 && chem<=100){
            average+=chem;
            i++;
        }
        if(mus>=0 && mus<=100){
            average+=mus;
            i++;
        }
        average/=i;
        System.out.println("Average is "+ (average));

        if(average>=55){
            System.out.println("You Passed");
        }
        else
            System.out.println("You Failed");
    }
}