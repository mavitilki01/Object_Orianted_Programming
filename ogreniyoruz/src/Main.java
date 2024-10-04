//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    student ogrenci = new student();
    ogrenci.input();
    ogrenci.calculate(ogrenci.midterm, ogrenci.Final);

    ogrenci.display();
    }
    }