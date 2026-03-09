class Student {
    // private data (cannot access directly)
    private String name;
    private int age;

    // getter method
    public String getName() {
        return name;
    }

    // setter method
    public void setName(String n) {
        name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        if (a > 0) {   // data validation
            age = a;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Pooja");
        s.setAge(20);

        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
