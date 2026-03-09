class A extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
        }
    }
}
class B extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("I am Pooja");
        }
    }
}
public class Multithread {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.start();
        b.start();
    }
}
