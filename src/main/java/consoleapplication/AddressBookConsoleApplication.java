package consoleapplication;

import contacts.AddressBook;
import contacts.Contact;
import copy.AddressSplitter;
import copy.CONTACTLINES;
import copy.IReader;
import copy.MyFileReader;

import contacts.AddressBook;
import copy.TerminalReader;

public class AddressBookConsoleApplication {

    public static AddressBook addressBook = new AddressBook();

    public static void main(String [ ] args) {

        TerminalReader reader = new TerminalReader();
        AddressBookConsoleApplication app = new AddressBookConsoleApplication();
        addressBook = app.loadAddressBook();
        System.out.println("Would you like to add a new address?");

        System.out.println("Welcome to your Address Book.");
        System.out.println("Chose the option and follow the instructions.");
        System.out.println("AddContact: <first name> <second name> <home address> <phone number>.");
        System.out.println("DeleteContact: <index>");
        System.out.println("ListContacts.");
        System.out.println("Exit Address Book.");

        boolean exit = false;
        do {

        String inputLine = reader.read();
        String[] words = inputLine.split(" ");

        String command = words[0];
        switch(command)
        {
            case "AddContact":
                addContact();
                break;

            case "DeleteContact":
                deleteContact();
                break;

            case "ListContacts":
                listContacts();
                break;

            case "Exit":
                exit = true;
                break;

            default:
                System.out.println("The system did not get your command.");
                break;

        }
            }

        while(exit == false);





    }

    private AddressBook loadAddressBook() {
        Contact contact = new Contact();
        IReader bookReader = new MyFileReader();
        AddressSplitter splitter = new AddressSplitter(bookReader.read());
        for (int i = 0; i < splitter.getAddresses().length; i++) {
            contact.setFirstName(splitter.getAddressNField(i, CONTACTLINES.FirstName.getValue()));
            contact.setLastName(splitter.getAddressNField(i, CONTACTLINES.LastName.getValue()));
            contact.setHomeAddress(splitter.getAddressNField(i, CONTACTLINES.AddressOne.getValue()));
            contact.setPhoneNumber(splitter.getAddressNField(i, CONTACTLINES.PhoneNumber.getValue()));
            addressBook.addContact(contact);
        }
        return addressBook;
    }
    private static void deleteContact() {
    }

    private static void addContact() {
        
    }
    
}
