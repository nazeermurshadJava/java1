package exceptionhandlingjava;

public class MultipleTryCatch {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7};
        String s="null";
        int a=100,b=0;
        try {
            try {
                try {
                    System.out.println(a/b);
                }catch (ArithmeticException e) {
                    System.out.println(e);
                    e.printStackTrace();
                }
            }catch (StringIndexOutOfBoundsException e){
                System.out.println(e);
            }

            System.out.println("elments at index" + arr[3]);

        }catch (ArithmeticException e){
            System.out.println(e);

        }finally {
            System.out.println();
        }

    }
}
