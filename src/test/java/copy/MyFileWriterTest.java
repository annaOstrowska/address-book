package copy;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyFileWriterTest {

    @Test
    public void testOutputAddressBook() throws Exception {
        MyFileWriter writer = new MyFileWriter();
        writer.outputAddressBook("firstName, Mario, Gateshead, 07976125051;\nfirstName2, lastName2, homeAddressLines2, 555050769;\nDaniel, Quirk, Dune, 55505005050;");
    }
}