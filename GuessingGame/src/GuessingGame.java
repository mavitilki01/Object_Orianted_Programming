import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    int GuessingNumber;
    Player p1;
    int maxTrial;

    GuessingGame(Player p1) {
        this.p1 = p1;
        Random random= new Random();
        this.GuessingNumber = random.nextInt(100)+1;
    }
    int Start(){
        int guess;
        Scanner input = new Scanner(System.in);
        while(p1.getTrial()<maxTrial){
            guess = input.nextInt();
            p1.increaseTrial();
            if(guess==GuessingNumber){
                System.out.println("\n\nYOU WIN!!!\n\n");
                
                return p1.getWin();
            }
        }
        return 0;
    }


}
/*
2.	GuessingGame Sınıfı:
o	Bu sınıf, sayı tahmin etme oyununun mantığını içerir.
o	Rastgele bir hedef sayı 1 ile 100 arasında oluşturulur.
o	Oyuncuya sayıyı tahmin etmesi için en fazla 10 deneme hakkı verilir.
o	Her tahminden sonra geri bildirim sağlanır: çok yüksek, çok düşük veya doğru olup olmadığı.
o	Oyun sona erdikten sonra (doğru tahmin ederek veya tüm denemeleri kullanarak), istatistikler görüntülenir.

 */

