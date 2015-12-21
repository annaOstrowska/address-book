package Copy;

public class Copy {
    public String copyOutput() {
        IReader reader = new TerminalReader();
        return read(reader);
    }
    private String read(IReader reader){
        return reader.read();
    }

}
