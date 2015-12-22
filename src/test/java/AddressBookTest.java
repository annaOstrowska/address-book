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

       Assert.assertTrue();


    }

    @Test

    public void testAddNewContactAndFail() {
//na poczatku konfiguruje adres buka tak zeby mial juz kontakt a potem chce dodac ten sam co juz jest i sprawdzam ze sie nie dodal
// biore liste contaktow i licze ile wystapien jest mojego kontaktu i powinno sie rownac 1 -.prywatna metoda testu sprawdz ile wystapien kontaktow w liscie

    }


    @Test
    public void testRemoveContactAndSucceed() {
        Contact contact = new Contact("Anna", "Jack", "Metal Box Factory 88, London SE1", "07888999777");
        addressBook.addContact(contact);

    }

    @Test
    public void testClearAllContactsListAndSucceed() {

    }
}
