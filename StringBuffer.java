public class StringBuffer {
    public static void main(String[] args) {
       String str = "malayalam";
       int count=0;
       for(int i=0;i<str.length();i++){
        for(int j=str.length()-1;j>=0;j--){
            if(str.charAt(i)==(str.charAt(j))){
                count++;

            }
        }

       }
       if(count==str.length()){
        System.out.println("Palindromr");
       }
       else{
        System.out.println("not a pal");
       }
    }
}