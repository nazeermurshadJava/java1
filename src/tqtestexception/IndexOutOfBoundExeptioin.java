package tqtestexception;

public class IndexOutOfBoundExeptioin {
    public static void main(String[] args) {
        String name="java";
        int a[]={4,5,6,7,8,25};
        try {
            for (int i=0;i<name.length();i++){
                System.out.println(name.charAt(10));
            }
        }catch (StringIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        try {
            System.out.println(a[10]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("hello");
        System.out.println(name.charAt(40));

    }
}
