package patternPrograms;

public class Demo2 {
    public static void main(String[] args) {
        int alp=65;
       for(int i=0;i<=5;i++){
           for (int j=0;j<i;j++)
           System.out.print((char)+alp+i);
           alp++;
       }
        System.out.println();
    }
}
