package main;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "table")
@XmlAccessorType(XmlAccessType.FIELD)
public class Table {

    @XmlElement(name = "number")
    private String number;

    @XmlElement(name = "number_of_seats")
    private int number_of_seats;

    @XmlElement(name = "smoking")
    private String smoking;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getNumber_of_seats() {
        return number_of_seats;
    }

    public void setNumber_of_seats(int number_of_seats) {
        this.number_of_seats = number_of_seats;
    }

    public String getSmoking() {
        return smoking;
    }

    public void setSmoking(String smoking) {
        this.smoking = smoking;
    }

    int flag;

    public int IsReserved(String Table_Number) {

        Main.reservationList.forEach((n) -> {

            if (Table_Number.equals(n.getTable_Number())) {

                flag = 1;
            }
        });

        if (flag > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
