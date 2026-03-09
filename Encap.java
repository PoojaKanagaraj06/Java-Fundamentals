//encapsulation example
class RollNo{
    //encapsulating variable\/
    private int roll;
    private String name;
    private int mobile;
    //using setter and getter method
    public void setRollNo(int n) {
        roll = n;
    }
    public void setmobile(int n) {
        mobile = n;
    }
    public void setName(String s) {
        name = s;
    }
    public int getRollNo() {
        return roll;
    }
    public String getName() {
        return name;
    }
    public int getmobile() {
        return mobile;
    }
}

public class Encap {
    public static void main(String[] args) {
        RollNo n = new RollNo();
        n.setRollNo(35);
        System.out.println("Rollno: " + n.getRollNo());
        n.setmobeile(1234567);
        System.out.println("call: " + n.getmobile());
        n.setName("Pooja");
        System.out.println("Name: " + n.getName());
    }
}
