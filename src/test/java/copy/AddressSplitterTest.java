package copy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddressSplitterTest {


    @Test
    public void testGetAddressNField() throws Exception {
        MyFileReader reader = new MyFileReader();
        String addressLines = reader.read();

        //same line
        AddressSplitter addressSplitter = new AddressSplitter(addressLines);
        assertEquals("lastName2", addressSplitter.getAddressNField(1, CONTACTLINES.LastName.getValue()));
    }
}