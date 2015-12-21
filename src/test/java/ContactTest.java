import contacts.Contact;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ContactTest {

    Contact contact;

    @Before
    public void setUp() {
        contact = new Contact("firstName", "lastName", "homeAddress", "phoneNumber");
    }

    @Test
    public void canConstructANewContact() {
        Contact contact = new Contact();
    }

    @Test
    public void testGetFirstName() {

        Assert.assertEquals("Expected default firstName", "firstName", contact.getFirstName());
    }

    @Test
    public void testGetLastName() {

        Assert.assertEquals("Expected default lastName", "lastName", contact.getLastName());
    }

    @Test
    public void testGetHomeAddress() {

        Assert.assertEquals("Expected default homeAddress", "homeAddress", contact.getHomeAddress());
    }

    @Test
    public void testGetPhoneNumber() {

        Assert.assertEquals("Expected default phoneNumber", "phoneNumber", contact.getPhoneNumber());
    }

    @Test
    public void setNewValuesToFirstName() {
        contact.firstName = "Jack";

        Assert.assertEquals("Expect not a default firstName", "Jack", contact.firstName);
    }

    @Test
    public void setNewValuesToLastName() {
        contact.lastName = "Anna";

        Assert.assertEquals("Expact not a default lastName", "Anna", contact.lastName);
    }

    @Test
    public void setNewValuesToHomeAddress() {
        contact.homeAddress = "Metal Box Factory 88, London SE1";

        Assert.assertEquals("Expect not a default homeAddress", "Metal Box Factory 88, London SE1", contact.homeAddress);
    }

    @Test
    public void setNewValuesToPhoneNumber() {
        contact.phoneNumber = "07888999777";

        Assert.assertEquals("Expect not a default phoneNumber", "07888999777", contact.phoneNumber);
    }
}





