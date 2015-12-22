package contacts;

import java.util.ArrayList;
import java.util.List;


public class AddressBook {

    public List<Contact> contacts = new ArrayList<>();

    public AddressBook() {
    }

    public boolean addContact(Contact contact) {
        // First check if address already exists
        if (contacts.contains(contact)) {
            return false;
        } else {
            contacts.add(contact);
            return true;
        }
    }

    public void removeContact(Contact contact) {

        contacts.remove(contact);
    }

    public void clearConatctList() {

        contacts.clear();
    }

    public boolean hasContact(Contact contact) {
            return contacts.contains(contact);
        }

    public int getNumberOfContacts()
    {
        return contacts.size();
    }

    public String getAddressBookAsString(){
        StringBuilder addresses = new StringBuilder();
        for(Contact contact: contacts){
            addresses.append(contact.getContactAsString());
        }
        return addresses.toString();
    }

}
