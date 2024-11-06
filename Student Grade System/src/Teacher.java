public class Teacher {
    String name;
    int phone;
    String branch;

    Teacher(String name, int phone, String branch){
        this.name=name;
        this.phone=phone;
        this.branch=branch;
    }
    void print(){
        System.out.println("Adı: " + this.name);
        System.out.println("Telefon numarası: " + this.phone);
        System.out.println("Branşı: " + this.branch+ "\n");
    }
}
