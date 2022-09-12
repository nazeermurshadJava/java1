package iheritance;

public class TqStaff extends ThinkQuoteint{
    String staffName,teachingSubject,time;
    void setStaffData(String staffName,String teachingSubject,String time){
        this.staffName=staffName;
        this.teachingSubject=teachingSubject;
        this.time=time;
    }
    void display1(){
        System.out.println(subject1+" "+fees+" "+totalStudent);
        System.out.println(staffName+" "+teachingSubject+" "+time);

    }
    void display2(){
        System.out.println(subject2+" "+ fees+" "+totalStudent);
        System.out.println(staffName+" "+ teachingSubject+" "+time);
    }
}
