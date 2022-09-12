package iheritance;

public class GrandFather {
    String firstName,midName;
    static String lastName;
    void setGrandData(String firstName,String midName,String lastName) {
        this.firstName = firstName;
        this.midName = midName;
        this.lastName = lastName;
    }
        void display(){
            System.out.println(firstName+" "+midName+" "+lastName);

    }
}
