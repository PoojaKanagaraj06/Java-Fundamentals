import java.util.Scanner;
public class Patt{
    static void diamond(int n){       

        int x=0;
        for (int i=(((n/2)-1)*-1);i<=(n/2)-1;i++){
            if(i<0){  
                x=i*(-1);
            }
            else{
                x=i;
            }
            for(int j=1;j<=x;j++){
                System.out.print(" ");}
for(int k=1;k<=((n - x) - x)-1;k++){

    System.out.print("*");
}
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        diamond(n*2);

}

}

