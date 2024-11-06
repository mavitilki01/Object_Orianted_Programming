public class Main {
    public static void main(String[] args) {
    Teacher teacher1 = new Teacher("Naz",555,"Mat");
    Teacher teacher2 = new Teacher("Hilal",46,"Trh");
    Teacher teacher3 = new Teacher("İsra",780,"Fzk");

    Course Mat = new Course("Matematik", "101","Mat");
    Mat.addTeacher(teacher1);
    Course Trh = new Course("Tarih", "102","Trh");
    Trh.addTeacher(teacher2);
    Course Fzk = new Course("Fizik", "103","Fzk");
    Fzk.addTeacher(teacher3);

    Student student1 = new Student("Nisa","221021","10",Mat,Trh,Fzk);
    student1.addBulkExamNote(70,90,40);
    student1.addBulkQuizExamNote(70,58,99);
    System.out.println(student1.name + ":");
    student1.isPass();
    Student student2 = new Student("Harun","2021","11",Mat,Trh,Fzk);
    student2.addBulkExamNote(10,100,50);
    student2.addBulkQuizExamNote(80,34,55);
    System.out.println(student2.name + ":");
    student2.isPass();
    Student student3 = new Student("İrem","22101","9",Mat,Trh,Fzk);
    student3.addBulkExamNote(45,80,23);
    student3.addBulkQuizExamNote(10,22,88);
    System.out.println(student3.name + ":");
    student3.isPass();


    }
}
/*
Course Sınıfı Özellikleri :

Nitelikler : name,code,prefix,note,Teacher
Metotlar : Course() , addTeacher() , printTeacher()

Teacher Sınıfı Özellikleri :

Nitelikler : name,mpno,branch
Metotlar : Teacher()

Student Sınıfı Özellikleri :

Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote();
*/
