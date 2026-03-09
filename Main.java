class Animal{
    String name="";
    int age=0;
    Animal(String name, int age){
        this.name=name;
        this.age=age;
    }
    Animal(Animal ani){
        this.name=ani.name;
        this.age=ani.age;
    }
}
public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("JAZZ", 3);
        Animal cat=new Animal("Mia", 2);
        Animal anotherDog=new Animal("JAZY", 3);
        Animal anotherCat=new Animal("ROSY", 2);
        System.out.println("Name: " + dog.name + ", Age: " + dog.age);
        System.out.println("Name: " + anotherDog.name + ", Age: " + anotherDog.age);
        System.out.println("Name: " + cat.name + ", Age: " + cat.age);
        System.out.println("Name: " + anotherCat.name + ", Age: " + anotherCat.age);
    }    
}