import java.util.HashMap;
import java.util.Map;

public class phoneBook {
    Map<String, addContact> phoneBook = new HashMap<>();

    public void addContact(String name, String phoneNum) {
        addContact contacts = new addContact(name, phoneNum);
        phoneBook.put(name, contacts);
    }

    public void listContacts() {
        for (Map.Entry<String,addContact> entry : phoneBook.entrySet()){
            addContact contacts = entry.getValue();
            System.out.println("Name: " + contacts.getName() + " " +
                               "Phone Number: " + contacts.getPhoneNum() + '\'');
        }
    }
}
