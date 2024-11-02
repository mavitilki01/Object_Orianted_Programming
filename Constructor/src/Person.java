public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int id;
    static int increamentid;


    public Person(){
        this(null,null,0,0);
    }
    public Person(String firstName,String lastName){
        this(firstName,lastName, 0,0);
    }
    public Person(int id){
        this(null,null,0,id);
    }
    public Person(String firstName, String lastName, int age,int id){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.id=id;
        increamentid++;

    }
}
