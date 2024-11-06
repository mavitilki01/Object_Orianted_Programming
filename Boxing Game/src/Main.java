 public class Main {
    public static void main(String[] args) {
    Fighter fighter1 = new Fighter("Ahmet",30,100,87,40);
    Fighter fighter2 = new Fighter("Metin",35,100,95,30);
    Ring ring = new Ring(fighter1,fighter2,75,95);
    ring.run();
    }
}