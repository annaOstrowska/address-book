package contacts;

import java.util.ArrayList;
import java.util.List;


public class AddressBook {

    public List<Contact> contacts = new ArrayList<>();

    public AddressBook() {
    }

    public boolean addContact(Contact contact) {
        // First check if address already exists
//        if (contacts.contains(contact)) {
//            return false;
//        } else {
//            contacts.add(contact);
//            return true;
//        }
        contacts.add(contact);
        return true;
    }

    public void removeContact(Contact contact) {

        contacts.remove(contact);
    }

    public void clearConatctList() {

        contacts.clear();
    }

    public int getNumberOfContacts()
    {
        return contacts.size();
    }

}
