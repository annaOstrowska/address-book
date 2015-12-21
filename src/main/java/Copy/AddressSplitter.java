package copy;
import contacts.Contact;

import java.util.ArrayList;
import java.util.List;

public class AddressSplitter {
    String[] addresses;

    AddressSplitter (String fullAddress){
        this.addresses = readAllAddresses(fullAddress);

    }

    public String getAddressNField(int addressNo, int field){
        return getAddressNArray(addressNo)[field];
    }


    private String[] getAddressNArray(int addressNo){

        return getAddressN(addressNo).split(", ");
    }

    private String getAddressN(int addressNo){
        return this.addresses[addressNo];
    }
    private String[] readAllAddresses(String fullAddress){

        return fullAddress.split(";\n");
    }
}
