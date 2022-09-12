package MetodReturn;

public class Demo {
    public static void main(String[] args)
    {
       add(10,20,30);




    }
    public static int add(int a,int b,int c){

      int   res=a+b+c;
      System.out.println(res);

       return c;
    }
}