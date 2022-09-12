package arrys;

public class MInMaxNumArray {
    void minMax(int a[]){
        int max=a[0],min=a[0];
        for (int i=0;i<a.length;i++){

                if (a[i]>max) {
                    max = a[i];
                }
                if (a[i]<min)
                {
                    min=a[i];
            }
        }
        System.out.println("minimum number"+min );
        System.out.println("maximum number"+ max);
    }

    public static void main(String[] args) {
        int a[]={57,35,20,45,7,5,78};
        MInMaxNumArray m=new MInMaxNumArray();
        m.minMax(a);
    }
}
