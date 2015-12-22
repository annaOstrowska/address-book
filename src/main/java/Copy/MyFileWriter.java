package copy;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter implements IWriter{

    @Override
    public void outputAddressBook(String addressBook) {
        String workingDir = System.getProperty("user.dir");
        try {
            FileWriter writer = new FileWriter(workingDir + "/src/main/java/copy/addresses.txt", false);
            writer.write(addressBook);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
