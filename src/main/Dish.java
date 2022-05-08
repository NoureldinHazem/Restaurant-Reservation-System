package main;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlRootElement( name = "dish")
@XmlAccessorType(XmlAccessType.FIELD)
public class Dish {
    
    @XmlElement( name = "price")
    private int price ;
    
    @XmlElement( name = "name")
    private String name ; 
    
    @XmlElement( name = "type")
    private String type ;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
       
}
