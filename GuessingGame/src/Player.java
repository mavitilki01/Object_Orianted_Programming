import java.util.Scanner;

public class Player {
    private String name;
    private int trial;
    private static int win;

    Player(String name){
        this.name=name;
        this.trial=0;
        win=0;
    }
    String getName(){
        return this.name;
    }
    int getTrial(){
        return this.trial;
    }
    int getWin(){
        return win;
    }
    void increaseTrial(){
        trial++;
    }
    int increaseWin(int win){
        return win++;
    }

    String playerInfo(){
        return getName() + ":" + "Your wins: "+ getWin()+ "\nTrials: "+ getTrial();
    }



/*
3.	Oyuncu Sınıfı:
o	İsim, oynanan oyun sayısı ve galibiyet sayısı dahil olmak üzere oyuncu verilerini depolar.
o	Oynanan oyunları ve kazançları artırmak için yöntemler içerir.

 */

}