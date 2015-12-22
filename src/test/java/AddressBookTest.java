import contacts.AddressBook;
import contacts.Contact;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class AddressBookTest {

    private AddressBook addressBook;


    @Before
    public void setUp() {
        addressBook = new AddressBook();
    }

    @Test
    public void testAddNewContactAndSucceed() {
        Contact contact = new Contact("Anna", "Jack", "Metal Box Factory 88, London SE1", "07888999777");
        addressBook.addContact(contact);

        Assert.assertTrue(addressBook.hasContact(contact));
    }

    @Test
    public void testCannotAddSameContactTwice() {
        Contact contact = new Contact("Anna", "Jack", "Metal Box Factory 88, London SE1", "07888999777");
        addressBook.addContact(contact);

        boolean contactAdded = addressBook.addContact(contact);
        Assert.assertFalse(contactAdded);
    }


    @Test
    public void testCanRemoveContactAndSucceed() {
        Contact contact = new Contact("Anna", "Jack", "Metal Box Factory 88, London SE1", "07888999777");
        addressBook.addContact(contact);
        addressBook.removeContact(contact);

        Assert.assertFalse(addressBook.hasContact(contact));
    }

    @Test
    public void testClearAllContactsListAndSucceed() {
        Contact contact1 = new Contact("Annaa", "Jack", "Metal Box Factory 88, London SE1", "07888999777");
        Contact contact2 = new Contact("An", "Ja", "Metal Box Factory 89, London SE1", "07888999777");
        addressBook.addContact(contact1);
        addressBook.addContact(contact2);

        addressBook.clearConatctList();

        Assert.assertEquals("Expected length of list is 0", 0, addressBook.getNumberOfContacts());
    }
}



