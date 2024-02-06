//Motorcycle Towing App - Customer
public class Customer {

    // Instance Variables
    private int customerId;
    private String name;
    private String email;
    private String phone;

    //  Constructor
    public Customer(int customerId, String name, String email, String phone) {
        this.customerId = customerId;
        this.name = name;
        this.emailAddress = email;
        this.phoneNumber = phone;
    }

    // Getters and Setters
    public long getCustId() {return custId;}
    // public String getName() {return name;}
    public String getEmail() {return email;}
    public String getPhone() {return phone;}
    
    public void setCustId(long custId) {this.custId = custId;}
    public void setName(String name) {this.name = name;}
    public void setEmail(String email) {this.email = email;}
    public void setPhone(String phone) {this.phone = phone;}

    // Methods
    public String getName (String firstName, String lastName, String bizName) {
        if(bizName.isEmpty()){
            name = firstName + " " + lastName;
        }else{
            name = firstName + " " + lastName + "," + bizName;
        }
        return name;
  }

}
