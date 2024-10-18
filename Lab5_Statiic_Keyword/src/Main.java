public class Main {
    public static void main(String[] args) {




        Circle[] circles = {
                new Circle(5),
                new Circle(10),
                new Circle(15),
        };

        for(Circle circle : circles) {
            System.out.println("Area is : " + circle.calculateArea());
        }

       worker[] workers ={
                new worker(40000,10500),
                new worker(56090,65431),
               new worker(23456,3423)
       };

        for(worker worker:workers){
            System.out.println("Workers last money: "+ worker.workerTotal());
        }






/*   Circle[] radius= new Circle[3];
        radius[0] = new Circle(5.0);
        radius[1] =new Circle(10.0);
        radius[2] =new Circle(15.0);

        for(Circle r : radius) {
            System.out.println("Circle area is "+ result);
            double result = r.calculateArea();


     */








    }


    /*

     */













}
