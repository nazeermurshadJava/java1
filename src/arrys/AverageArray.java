package arrys;

public class AverageArray {
    void averageArray(int a[]){
        int sum=0;
        double d=0.0;
        for (int i=0;i<a.length;i++){
            sum=sum+a[i];

        }
        d=sum/a.length;
        System.out.println(d);
    }


    public static void main(String[] args) {
        int a[]={20,40,30,20,40,20};
        AverageArray ob=new AverageArray();
        ob.averageArray(a);
    }
}
