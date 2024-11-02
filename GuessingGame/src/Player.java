import java.util.Scanner;

public class Player {
    Scanner input =new Scanner(System.in);
    String name;
    static int trials;
    GuessingGame guess;

    public Player(String name){
        this.name=name;

    }

    public void Guess(){
        if(GuessingGame.isOver) return;
        System.out.print("Guess it!\t");



        for(int i=0;i<10;i++){
            System.out.println("Enter a valid 1 to 100");
            int think = input.nextInt();
            if(0>think || think>100){
                System.out.println("Wrong valid!");
                i--;
            }
            else if(guess==think){

            }
        }




    }
}