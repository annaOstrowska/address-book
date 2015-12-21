import java.util.ArrayList;
import java.util.List;


public class AddressBook {

    List<Contact> contacts = new ArrayList<>();

    public AddressBook() {
    }

    public void addContact(Contact contact) {
        // First check if address already exists
        if (contacts.contains(contact)) {
            System.out.println("This address is already there.");
        } else {
            contacts.add(contact);
        }
    }

    public void removeContact(Contact contact) {
        contacts.remove(contact);
    }

    public void clearConatctList() {
        contacts.clear();
    }
}
