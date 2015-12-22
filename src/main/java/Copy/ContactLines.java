package copy;

public enum CONTACTLINES {
    FirstName(0),
    LastName(1),
    AddressOne(2),
    PhoneNumber(3);

    private final int value;

    CONTACTLINES(final int newValue){
        value = newValue;
    }

    public int getValue() {return value;}
}
