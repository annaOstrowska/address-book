package copy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddressSplitterTest {


    @Test
    public void testGetAddressNField() throws Exception {
        AddressSplitter addressSplitter;
        MyFileReader reader = new MyFileReader();
        String addressLines = reader.read();
        addressSplitter = new AddressSplitter(addressLines);
        assertEquals("lastName2", addressSplitter.getAddressNField(1, ContactLines.LastName));
    }
}