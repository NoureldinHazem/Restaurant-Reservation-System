package main;

import java.util.ArrayList;
import java.util.List;

public class Manager extends User {
     public Manager (String Name,String User_Name,String Password,String Role){
         super ();
     }
     
     static List<String> Reserved_Tables_Number = new ArrayList<>();
    static int flag;
    public static void getReserved_Tables(){
            Main.reservationList.forEach((y)-> {
            flag=0;
            Reserved_Tables_Number.forEach((x)->{
               if (x.equals(y.getTable_Number())) {
                    flag=1;
               }      
        });
            if (flag==0) {
                Reserved_Tables_Number.add(y.getTable_Number());
            }
    });
}
    
}
