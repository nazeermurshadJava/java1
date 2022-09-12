package iheritance;

public class TqStaffMain {
    public static void main(String[] args) {
        TqStaff t=new TqStaff();
        t.setSubject1Data("DEVLOPMENT",45000,10);
        t.setStaffData("RAKSHA MAM","JAVA","2.30PM TO 5PM");
        t.display1();
        t.setSubject2Data("TESTTING",30000,20);
        t.setStaffData("SOHAIL SIR","SOFTWARE TESTING","12PM TO 4PM");
        t.display2();
    }
}
