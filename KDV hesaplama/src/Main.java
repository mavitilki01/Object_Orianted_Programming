import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float fiyat, KDVliFiyat;
        System.out.println("KDV'li tuatarını hesaplamak için bir fiyat giriniz= ");
        Scanner input = new Scanner(System.in);
        fiyat= input.nextFloat();
        if(fiyat<=1000){
            KDVliFiyat=KDV18(fiyat);
        }
        else{
            KDVliFiyat=KDV8(fiyat);
        }
        System.out.println("KDV'li fiyat: "+ KDVliFiyat);

    }
    static float KDV18(float fiyat){

        return fiyat+fiyat*0.18f;
    }
    static float KDV8(float fiyat){
        return fiyat+fiyat*0.8f;
    }
}