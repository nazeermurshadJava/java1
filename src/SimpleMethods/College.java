package SimpleMethods;

public class College {
     void displayName(){
         System.out.println("NAME IS: KPMIM COLLEGE SOALPUR");
     }

     void displayDepartment()
    {
        System.out.println("THERE ARE TOTAL FOUR DEPARTMENT IN THIS COLLEGE");
    }

    public static void main(String[] args) {
        College sc = new College();
        sc.displayName();
        sc.displayDepartment();
        System.out.println("thanks");




    }
}
