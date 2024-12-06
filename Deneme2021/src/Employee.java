public class Employee {
    private int empId;
    private String name;
    public String companyName = "Google";
    String[] salad;

     public Employee(String name, int empId,String cName){
            this.name=name;
            this.empId= empId;
            this.companyName= cName;
             }
     public String getName(){
             return this.name;


             }
     public int getId(){
             return this.empId;
             }
      void printName(){
              System.out.println(" Name:"+ name);
             }
     @Override
     public String toString(){
              return this.empId+": name:"+this.name;
              }}