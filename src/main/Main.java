package main;

import java.io.File;
import javax.xml.bind.Unmarshaller;
import java.util.List;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
 
public class Main {
            
static List<Reservation> reservationList = new ArrayList<>();
            
    public static void main(String[] args)throws Exception {
             
            JAXBContext jaxbContext = JAXBContext.newInstance(Reservations.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();          
            Reservations reservations = (Reservations) unmarshaller.unmarshal(new File("Reservation_File.xml"));
            try {
            Reservations savedReservations = new Reservations();      
            reservations.getReservations().forEach((r) -> {
            reservationList.add(r);
            });
            
    }catch (NullPointerException  e){}
            
            LoginWindow form = new LoginWindow();
            form.setVisible(true);
            form.setLocationRelativeTo(null);

    }
}
