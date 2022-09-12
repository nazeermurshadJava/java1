package iheritance;

public class ChildInfo extends FatherInfo{
    String firstName;
    void setChildData(String firstName){
        this.firstName=firstName;
    }
    void display(){
        super.display();
        System.out.println(firstName+ " "+super.midName+ " "+super.lastName);
    }
}
