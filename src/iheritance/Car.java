package iheritance;

public class Car {
    int id ;
    String name,carNumber;
    Driver d;
    Car(int i,String n,String c,Driver d){
        this.id=i;
        this.name=n;
        this.carNumber=c;
        this.d=d;
    }
    public String toString(){
        return id+" "+name+" "+carNumber+" "+d;
    }
}
