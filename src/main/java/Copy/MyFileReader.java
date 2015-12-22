package copy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;

public class MyFileReader implements IReader {
    @Override
    public String read() {
        try {
            String workingDir = System.getProperty("user.dir");
            Reader fileReader = new java.io.FileReader(workingDir + "/src/main/java/copy/addresses.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line = null;

            while((line = bufferedReader.readLine())!=null){
                stringBuffer.append(line).append("\n");

            }
            return stringBuffer.toString();
        }
        catch (FileNotFoundException fnf) {
            fnf.printStackTrace();
        }
        catch(IOException io){
            io.printStackTrace();
        }
        return null;
    }
}
