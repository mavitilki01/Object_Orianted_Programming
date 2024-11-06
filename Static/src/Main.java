public class Main {
    public static void main(String[] args) {
        float a;
        float b; //static içinde static tanımlayamıyorsun.

        Temp temp = new Temp("Hi!");
        Temp temp1 =new Temp(59);
        Temp temp2 =new Temp(38);
        Temp temp3 =new Temp(76);
        Temp temp4 =new Temp(90);
        temp.Test();
        temp3.hello="Alo";
        a= Temp.Test2(5f);
        System.out.println(a);
        b=Temp.Test2(0.3f);
        System.out.println(b);
        System.out.println(temp3.hello);
        System.out.println(temp2.hello);

    }
}