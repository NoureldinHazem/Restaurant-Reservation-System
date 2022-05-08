package main;

import javax.xml.bind.Marshaller;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Client extends User {

    public Client(String Name, String User_Name, String Password, String Role) {
        super();

    }

    public static void order(String Client_Name, String Table_Number, String Item, int Quantity, String Comment) {

        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E dd.MM.yyyy 'at' hh:mm:ss a");
        Reservation reservation = new Reservation();
        reservation.setClient_Name(Client_Name);
        reservation.setTable_Number(Table_Number);
        reservation.setItem(Item);
        reservation.setQuantity(Quantity);
        reservation.setComment(Comment);
        reservation.setDate(ft.format(date));
        Main.reservationList.add(reservation);

    }

    public static void save() {

        try {

            JAXBContext jaxbContext = JAXBContext.newInstance(Reservations.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            Reservations savedReservations = new Reservations();
            savedReservations.setReservations(Main.reservationList);
            marshaller.marshal(savedReservations, new File("Reservation_File.xml"));
            JOptionPane.showMessageDialog(null, "Dish Added Successfully.");
        } catch (JAXBException ex) {
            Logger.getLogger(LoginWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static int price;
    static String Type;
    static int Quantity;
    static String Item;
    static double Invoice;

    public static double getInvoice(String Table_Number) {
        Invoice = 0;
        price = 0;
        Type = null;
        Main.reservationList.forEach((r) -> {
            if (Table_Number.equals(r.getTable_Number())) {
                Item = r.getItem();
                Quantity = r.getQuantity();
                try {
                    JAXBContext jaxbContext = JAXBContext.newInstance(main.Restaurant.class);
                    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
                    Restaurant restaurant = (Restaurant) unmarshaller.unmarshal(new File("Input.xml"));
                    restaurant.getDishes().getDishes().forEach((dish) -> {
                        if (dish.getName().equals(Item)) {
                            price = dish.getPrice();
                            Type = dish.getType();
                        }
                    });
                } catch (JAXBException ex) {
                    Logger.getLogger(LoginWindow.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (Type.equals("appetizer")) {
                    Invoice = Invoice + (Quantity * price * 1.1);
                }

                if (Type.equals("main_course")) {
                    Invoice = Invoice + (Quantity * price * 1.15);
                }

                if (Type.equals("desert")) {
                    Invoice = Invoice + (Quantity * price * 1.2);
                }
            }
        });
        return Invoice;
    }

}
