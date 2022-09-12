package arrys;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int size=sc.nextInt();
        Emplyee emp[]=new Emplyee[size];
    for (int i=1;i<size;i++){
        System.out.println("enter id ,name,dept,salary");
        int id=sc.nextInt();
        String name=sc.next();
        String dept=sc.next();
        int salary= sc.nextInt();
        emp[i]=new Emplyee(id,name,dept,salary);
        for(Emplyee e:emp){
           // System.out.println(e);

         /*  if(e.dept.equalsIgnoreCase("hr"));
            System.out.println(e);

          */
            if (e.salary>60000){
                System.out.println(e.name+" "+e.salary);
            }
        }

        }
    }

    }
