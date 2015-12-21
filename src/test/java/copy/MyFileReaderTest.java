package copy;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyFileReaderTest {
    MyFileReader myFileReader = new MyFileReader();

    @Test
    public void testRead() throws Exception {
        assertEquals("firstName, lastName, homeAddressLines, 07976125051;\n" +
                "firstName2, lastName2, homeAddressLines2, 555050769;\n", myFileReader.read());
    }
}