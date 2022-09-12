package tqteststr;

public class Q3 {
    public static void main(String[] args) {
        String s="THE SKY IS THE LIMIT";
        String str[]=s.split(" ");
        for (int i=0;i< str.length;i++){
            int sum=0;
            char ch[]=str[i].toCharArray();
            for (int j=0;j< ch.length;j++){
                int v=ch[j]-64;
                sum=sum+v;
            }
            System.out.println(str[i]+" "+sum);
        }
    }
}
