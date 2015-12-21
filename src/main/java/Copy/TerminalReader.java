package Copy;
import java.util.Scanner;

public class TerminalReader implements IReader {
    Scanner scanner = new Scanner(System.in);
    @Override
    public String read(){
        return scanner.next();
    }

}
