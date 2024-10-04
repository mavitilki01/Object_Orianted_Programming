import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int math, phy, chm, trk, hist, music;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your mathematics grade=");
        math=input.nextInt();
        System.out.print("Enter your physic grade=");
        phy=input.nextInt();
        System.out.print("Enter your chemistry grade=");
        chm=input.nextInt();
        System.out.print("Enter your Turkish grade=");
        trk=input.nextInt();
        System.out.print("Enter your history grade=");
        hist=input.nextInt();
        System.out.print("Enter your music grade=");
        music=input.nextInt();

        float average=(math+phy+chm+trk+hist+music)/6f;
        System.out.println("Your average is " + average);
        System.out.println((average>60)?"Geçti":"Kaldı");
    }

}
