public class MainActivity {
    public static void main(String[] args) {
        phoneBook phonebook = new phoneBook();
        phonebook.addContact("John", "1234567890");
        phonebook.addContact("Alice", "9876543210");
        phonebook.addContact("Bob", "4567890123");

        phonebook.listContacts();
    }
}
