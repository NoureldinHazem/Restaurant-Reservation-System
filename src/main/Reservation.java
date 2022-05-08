
package main;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement( name = "reservation")
@XmlAccessorType(XmlAccessType.FIELD)

public class Reservation {

    @XmlElement( name = "client_name")
    private String Client_Name ; 
    
    @XmlElement( name = "table_number")
    private String Table_Number ; 
    
    @XmlElement( name = "item")
    private String Item ;
    
    @XmlElement( name = "quantity")
    private int Quantity;
    
    @XmlElement( name = "comment")
    private String Comment ;
    
    @XmlElement(name="time")
    private String Date;
    
    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getClient_Name() {
        return Client_Name;
    }


    public void setClient_Name(String Client_Name) {
        this.Client_Name = Client_Name;
    }


    public String getTable_Number() {
        return Table_Number;
    }


    public void setTable_Number(String Table_Number) {
        this.Table_Number = Table_Number;
    }


    public String getItem() {
        return Item;
    }


    public void setItem(String Item) {
        this.Item = Item;
    }

    
    public String getComment() {
        return Comment;
    }

    
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

}
