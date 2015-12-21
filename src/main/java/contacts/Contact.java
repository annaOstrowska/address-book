package contacts;

public class Contact {

    public String firstName;
    public String lastName;
    public String homeAddress;
    public String phoneNumber;


    public Contact () {
    }

    public Contact(String firstName, String lastName, String homeAddress, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.homeAddress = homeAddress;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getHomeAddress(){
        return homeAddress;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setHomeAddress(String homeAddress){
        this.homeAddress = homeAddress;

    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

}








