import java.util.Scanner;
public class Func{
    static int fact(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int f=1;
        for (int i=1;i<=a;i++){  
        f=f*i;
        }
        return f;
    }
    public static void main(String [] args){
        int fa=fact();
        System.out.println(fa);
}
}