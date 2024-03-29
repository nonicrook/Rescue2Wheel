import java.util.*;
import java.util.Scanner;

public class Tow extends Customer {
  
  // Instance Variables
  private int towId;
  private String customerName;
  private String pickUpAddress;
  private String dropOffAddress;
  private int distance;
  private String pickUpDateTime;
  private String dropOffDateTime;
  private double price;
  private String logo;
  
  // Constructor
  public Tow(int towId, String customerName, String pickUpAddress, String dropOffAddress, int distance, String pickUpDateTime, String dropOffDateTime, double price) {
    this.towId = towId;
    this.customerName = customerName;
    this.pickUpAddress = pickUpAddress;
    this.dropOffAddress = dropOffAddress;
    this.distance = distance;
    this.pickUpDateTime = pickUpDateTime;
    this.dropOffDateTime = dropOffDateTime;
    this.price = price;
    this.logo = "rescue2wheel-logo.png";
  }
  
  // Getters and Setters
  public int getTowId() {return towId;}
  // public String getCustomerName() {return customerName;}
  public String getPickUpAddress() {return pickUpAddress;}
  public String getDropOffAddress() {return dropOffAddress;}
  public int getDistance() {return distance;}
  public String getPickUpDateTime() {return pickUpDateTime;}
  public String getDropOffDateTime() {return DropOffDateTime;}
  public double getPrice() {return price;}
  
  public void setTowId(int towId) {this.towId = towId;}
  public void setCustomerName(String customerName) {this.customerName = customerName;}
  public void setPickUpAddress(String pickUpAddress) {this.pickUpAddress = pickUpAddress;}
  public void setDropOffAddress(String dropOffAddress) {this.dropOffAddress = dropOffAddress;}
//  public void setDistance(int distance) {this.distance = distance;}
  public void setPickUpDateTime(String pickUpDateTime) {this.pickUpDateTime = pickUpDateTime;}
  public void setDropOffDateTime(String dropOffDateTime) {this.dropOffDateTime = dropOffDateTime;}
  public void setPrice(double price) {this.price = price;}
  
// Methods
  public String toString() {
    return  "\n--------------------------------------------------------------" +
            "\n Towing Order " + 
            "\n--------------------------------------------------------------" + 
            "\n Tow ID: " + twoId +
            "\n Name: " + customerName +
            "\n Pick Up Address: " + pickUpAddress +
            "\n Drop Off Address: " + dropOffAddress + 
            "\n Distance : " + distance + 
            "\n Pick Up Date and Time: " + pickUpDateTime + 
            "\n Drop Off Date and Time: " + dropOffDateTime + 
            "\n Price: " + price + 
            "\n Logo: " + logo;
  }

  public String getCustomerName() {
    return customerName.getName();
  }
  
  
}
