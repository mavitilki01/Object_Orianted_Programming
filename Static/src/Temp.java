public class Temp {

    static int name;
    static int c =0;
    static int kar=0;
    String hello;
    final static float pi= 3.14f;

    Temp(int name){
        this.name=name;
        c++;
    }
    Temp(String hello){
        this.hello=hello;
        kar++;
    }
    void Test(){
        float k=pi*5;
        System.out.println(kar);
        System.out.println(c);
        System.out.println(k);
        s.p("Merhaba");
        s.p("Hayır!");

    }

    static float Test2(float x){
        x=x*pi;
        return x;
    }
}
