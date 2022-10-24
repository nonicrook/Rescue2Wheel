//Motorcycle Towing App - Customer
public class Customer {
  
  long custId;
  String fullName;
  String email;
  String phone;
  
  public Customer(long custId, String fullName, String email, String phone) {
    this.custId = custId;
    this.fullName = fullName;
    this.email = email;
    this.phone = phone;
  }
  
  // Getters and Setters
  public long getCustId() {return custId;}
  public String getFullName() {return fullName;}
  public String getEmail() {return email;}
  public String getPhone() {return phone;}
  
  public void setCustId(long custId) {this.custId = custId;}
  public void setFullName(String fullName) {this.fullName = fullName;}
  public void setEmail(String email) {this.email = email;}
  public void setPhone(String phone) {this.phone = phone;}  
  
}
