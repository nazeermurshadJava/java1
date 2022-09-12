package tqtest4;

public class PersonIdMain {
    public static void main(String[] args) {
        Id_Proof i=new Id_Proof("demo","1234567",2050);
        Person p=new Person(101,"sohail","56789","pune",i);
        System.out.println(p);

    }
}
