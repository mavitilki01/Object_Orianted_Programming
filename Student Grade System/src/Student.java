public class Student {
    Course course1,course2,course3;
    String name, stuNo, classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2 , Course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.course1=c1;
        this.course2=c2;
        this.course3=c3;
        this.average=0.0f;
        this.isPass=false;
    }

    void addBulkExamNote(int note1,int note2,int note3){
        if(note1>=0 && note1<=100)
            course1.note=note1;
        if(note2>=0 && note2<=100)
            course2.note=note2;
        if(note3>=0 && note3<=100)
            course3.note=note3;
    }
    void addBulkQuizExamNote(int note1,int note2,int note3){
        if(note1>=0 && note1<=100)
            course1.quiz=note1;
        if(note2>=0 && note2<=100)
            course2.quiz=note2;
        if(note3>=0 && note3<=100)
            course3.quiz=note3;
    }

    void isPass(){
        this.average=((this.course1.note*0.8)+(this.course1.quiz*0.2)+(this.course2.note*0.8)+(this.course2.quiz*0.2)+(this.course3.note*0.8)+(this.course3.quiz*0.2))/3.0;
        printNode();
        if(this.average>=50){
            System.out.println("Geçti\n");
        }
        else
            System.out.println("Kaldı\n");

    }

    void printNode(){
        System.out.println(course1.name + " dersi notu: " + course1.note);
        System.out.println(course1.name + " dersi quiz notu: " + course1.quiz);
        System.out.println(course2.name + " dersi notu: " + course2.note);
        System.out.println(course2.name + " dersi quiz notu: " + course2.quiz);
        System.out.println(course3.name + " dersi notu: " + course3.note);
        System.out.println(course3.name + " dersi quiz notu: " + course3.quiz+ "\n");
        System.out.println("Ortalama: "+ this.average);

    }

}
