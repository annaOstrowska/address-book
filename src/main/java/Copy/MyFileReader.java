package copy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.*;

public class MyFileReader implements IReader {
    @Override
    public String read() {
        Reader fileReader = null;
        try {
            String workingDir = System.getProperty("user.dir");
            fileReader = new java.io.FileReader(workingDir + "/src/main/java/copy/addresses.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            while((line = bufferedReader.readLine())!=null){
                stringBuffer.append(line).append("\n");

            }
            return stringBuffer.toString();
        }
        catch (IOException  io) {
            io.printStackTrace();
        }
        finally {

            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
