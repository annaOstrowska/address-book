package consoleapplication;

import contacts.AddressBook;
import copy.TerminalReader;

public class AddressBookConsoleApplication {

    AddressBook addressBook = new AddressBook();

    public static void main(String [ ] args) {

        TerminalReader reader = new TerminalReader();

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

    private static void deleteContact() {
    }

    private static void addContact() {
        
    }
    


}

