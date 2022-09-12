package patternPrograms;

public class NamePattern {
    public static void main(String[] args) {
        String str=" THINKQUOTIENTS";
        int len=str.length();
        for (int i=0;i<len;i++){
         for (int j=0;j<len;j++){
          if (i==len/2){
           System.out.print (str.charAt(j));

          }
          else if(j==len/2){
           System.out.print(str.charAt(i));
          }
          else {
           System.out.print(" ");
          }
         }
         System.out.println();
        }
    }
}
