package copy;
import java.util.Scanner;

public class TerminalWriter implements IWriter{


    public void outputAddressBook(String addressBook) {
        addressBook = addressBook.replace("~", ";");
        System.out.println("\n" + addressBook + "\n");
    }
}