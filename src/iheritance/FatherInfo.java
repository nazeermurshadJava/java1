package iheritance;

public class FatherInfo extends GrandFather {
    String firstName;
    void setFatherData(String firstName){
        this.firstName=firstName;
    }
    void display(){
        super.display();
        System.out.println(firstName+" "+super.midName+" "+super.lastName);
    }
}
