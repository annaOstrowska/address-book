package copy;

import org.junit.Test;

import static org.junit.Assert.*;

public class CopyTest {

    Copy copy = new Copy();

    @Test
    public void testCopyOutput() throws Exception {
        assertEquals("Ignore this one", "hello", copy.copyOutput());
    }
}