package tqtest1;

public class Primeno300to400 {
    public static void main(String[] args) {
        int i=300;
        int num=0;
        String primeNumbers = "";
        for (i=300;i<=400;i++){
            int counter=0;
            for (num=i;num>1;num--){
                if (i%num==0){
                    counter=counter+1;

                }
            }
            if (counter==2){
                primeNumbers=primeNumbers+i+ " ";
            }
        }
        System.out.println("prime numbers from 300 to 400 :");
        System.out.println(primeNumbers);
    }
}
