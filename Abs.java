abstract class flower{
    abstract void name();
    String color="";
    void bloom(){
            System.out.println("flower is blooming");
    }
}
class rose extends flower{

    void bloom(){
        System.out.println("Rose is Blooming");
    }
    void name(){
        System.out.println("I am Red rose");
    }
}
public class Abs{
    public static void main(String[] args) {
        rose r1=new rose();
        r1.bloom();
        r1.name();
        r1.color="Red";
        System.out.println(r1.color);
    }
}