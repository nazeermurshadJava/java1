package tqtestexception;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        int a=10,b=0;
        int arr[]={45,55,6,7};
        String name=null;
        try {
            try {
                try {
                    if (name.equals("xyz"))
                        System.out.println("same");
                    else System.out.println("not same");
                }catch (NullPointerException e){
                    e.printStackTrace();
                }
                System.out.println(a/b);
            }catch (ArithmeticException e){
                e.printStackTrace();
            }
            System.out.println(arr[10]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("welcome");
    }
}
