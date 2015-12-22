package copy;
import java.util.Scanner;

public class TerminalWriter implements IWriter{


    public void outputAddressBook(String addressBook) {
        System.out.println("\n" + addressBook + "\n");
    }
}
