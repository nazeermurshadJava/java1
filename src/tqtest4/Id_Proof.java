package tqtest4;

public class Id_Proof {
    int validety;
    String name,adharnumber;
    Id_Proof(String name,String adharnumber,int validety){
        this.name=name;
        this.adharnumber=adharnumber;
        this.validety=validety;


    }
    public String toString(){
        return name+" "+adharnumber+" "+validety;

    }
}
