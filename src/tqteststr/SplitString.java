package tqteststr;

public class SplitString {
    public static void main(String[] args) {
        String str="HELLO$WORLD";
        String arr[]=str.split("\\$");
        System.out.println(arr.length);
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
