package consoleapplication;

import contacts.AddressBook;
import contacts.Contact;
import copy.*;

public class AddressBookConsoleApplication {

    public static AddressBook addressBook = new AddressBook();

    public static void main(String [ ] args) {

        TerminalReader reader = new TerminalReader();
        AddressBookConsoleApplication app = new AddressBookConsoleApplication();
        addressBook = app.loadAddressBook();

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
                   app.addContact()
                   ;break;

                case "DeleteContact":
                    app.deleteContact();
                    break;

                case "ListContacts":
                    IWriter terminalWriter = new TerminalWriter();
                    app.outputContacts(terminalWriter);
                    break;

                case "Exit":
                    exit = true;
                    IWriter fileWriter = new MyFileWriter();
                    app.outputContacts(fileWriter);
                    break;

                default:
                    System.out.println("The system did not get your command.");
                    break;

            }
            }

        while(!exit);

    }



    public AddressBook loadAddressBook() {
        IReader bookReader = new MyFileReader();
        AddressSplitter splitter = new AddressSplitter(bookReader.read());
        for (int i = 0; i < splitter.getAddresses().length; i++) {
            Contact contact = new Contact();
            contact.setFirstName(splitter.getAddressNField(i, CONTACTLINES.FirstName.getValue()));
            contact.setLastName(splitter.getAddressNField(i, CONTACTLINES.LastName.getValue()));
            contact.setHomeAddress(splitter.getAddressNField(i, CONTACTLINES.AddressOne.getValue()));
            contact.setPhoneNumber(splitter.getAddressNField(i, CONTACTLINES.PhoneNumber.getValue()));
            addressBook.addContact(contact);
        }
        return addressBook;
    }


    private void deleteContact() {
    }

    private void addContact() {
        TerminalReader reader = new TerminalReader();

        System.out.println("What is the first name?");
        String firstName = reader.read();
        System.out.println("What is the last name?");
        String lastName = reader.read();
        System.out.println("What is the address?");
        String homeAddress = reader.read();
        System.out.println("What is the phone number?");
        String phoneNumber = reader.read();

        Contact contact = new Contact(firstName, lastName, homeAddress, phoneNumber);
        addressBook.addContact(contact);

    }

    private void outputContacts(IWriter writer) {
        writer.outputAddressBook(addressBook.getAddressBookAsString());
    }
    
}
