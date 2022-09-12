package arrys;

public class VariableArgument {
    static void add(String s,int...a){
      int  sum=0;
      for (int i=0;i<a.length;i++){
          sum=sum+a[i];
      }
        System.out.println("addition is"+sum);
        System.out.println(s);
    }

    public static void main(String[] args) {
       int arr[]={10,20,30,40,50};
        add("s",arr);
        add("g",1,2,3,4,5,6,7);
    }
}
