//private constructor
class PrivateClass {
    private PrivateClass() {
        System.out.println("This is a private constructor.");
    }   
    public static void Private1(){
        System.out.println("Creating");
    }  


public class Private {
    public static void main(String[] args) {
       PrivateClass.Private1();
    }
}