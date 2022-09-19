package exceptionhandlingjava;

public class MultipleException {
    public static void main(String[] args) {
        MethodHandling m=new MethodHandling();
        int arr[]={10,20,30,40,50};
        String s=" ";
        int a=100,b=2;
        try {
            System.out.println("division is  :"+(a/b));
            System.out.println("elements at index : "+ arr[4]);
            m.toString();

        }catch (ArithmeticException e){

            e.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
