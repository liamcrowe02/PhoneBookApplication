import java.util.Scanner;

public class MainActivity {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        phoneBook phonebook = new phoneBook();

        System.out.println("Enter username");
        String userName = myObj.nextLine();

        System.out.println("Enter phone number");
        String phoneNo = myObj.nextLine();


        phonebook.addContact(userName, phoneNo);

        phonebook.listContacts();
    }
}
