package copy;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter implements IWriter{
    @Override
    public void outputAddressBook(String addressBook) {
        File addresses = new File("addresses.txt");
        String workingDir = System.getProperty("user.dir");
        try {
            FileWriter writer = new FileWriter(workingDir + "/src/main/java/copy/addresses.txt");
            writer.write(addressBook);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
