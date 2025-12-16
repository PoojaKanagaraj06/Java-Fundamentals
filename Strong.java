import java.util.Scanner;
public class Strong {
    static int factorial(int n){
             if (n==1){
                return 1;
             }
             else{
                return n*factorial(n-1);
             }
    }
    static int strong(int n){
        int sum=0;
        while(n>0){
            
            int b=n%10;
            sum+=factorial(b);
            n=n/10;


        }
        return sum;
    }
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            if(a==strong(a)){
                System.out.println("strong");            }
                else{
                    System.out.println("not strong"); 
                }
    }
}
