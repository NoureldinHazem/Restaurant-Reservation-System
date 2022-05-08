package main;

public class Waiter extends User {

    static String Client_Name;

    public Waiter(String Name, String User_Name, String Password, String Role) {
        super();
    }

    public static String getClient_Name(String Table_Number) {
        Client_Name = "";
        Main.reservationList.forEach((x) -> {
            if (Table_Number.equals(x.getTable_Number())) {
                Client_Name = x.getClient_Name();
            }

        });

        return Client_Name;

    }
}
