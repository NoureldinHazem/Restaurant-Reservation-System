package main;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement( name = "reservations")
@XmlAccessorType(XmlAccessType.FIELD)

public class Reservations {
 
    
    @XmlElement( name = "reservation")
    private List <Reservation> reservations;

    public List <Reservation> getReservations() {
        return reservations;
    }


    public void setReservations(List <Reservation> reservations) {
        this.reservations = reservations;
    }
}