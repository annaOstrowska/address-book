package copy;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class TerminalReaderTest {
    TerminalReader terminalReader = new TerminalReader();

    @Test
    public void testRead() throws Exception {
        String inputData = "as";
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream((inputData.getBytes())));
        System.setIn(stdin);
        terminalReader.read();
    }
}