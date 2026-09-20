import java.util.List;
import java.util.Scanner;

public class Main {
    
    private static final Scanner scanner = new Scanner (System.in);

    public static void main(String[] args)
    {
        ContanctRepository repository = new ContanctRepository();
        ContanctManager manager = new ContactManager(repository);

        while(true)

            {
                showMenu();

                int choice = readInt("Choose option");

                switch(choice)
                {
                    case 1: 
                        addContanct(manager);
                        break;

                    case 2:
                        viewContacts(manager);
                        break;
                    
                    case 3:
                        searchContact(manager);
                        break;

                    case 4:
                        updateContanct(manager);
                        break;
                    
                    case 5: 
                        deleteContanct(manager);
                        break;

                    case 6:
                        System.out.println("GoodBye");
                        scanner.close();
                        return;
                    
                    default:
                        System.out.println("Invalid option");
                }
            }
    }



    private static void showMenu() {    
            System.out.println("\n===== CONTACT MANAGER =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Update Contact");
            System.out.println("5. Delete Contact");
            System.out.println("6. Exit");
        }
    

    private static void addContact(ContactManager manager) {
    
            System.out.print("Name: ");
            String name = scanner.nextLine();
    
            System.out.print("Phone: ");
            String phone = scanner.nextLine();
    
            System.out.print("Email: ");
            String email = scanner.nextLine();
    
            Contact contact = manager.addContact(name, phone, email);
    
            System.out.println("Added: " + contact);
        }
    
    private static void viewContacts(ContactManager manager) {
    
            List<Contact> contacts = manager.getAllContacts();
    
            if (contacts.isEmpty()) {
                System.out.println("No contacts.");
                return;
            }
    
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    
    private static void searchContact(ContactManager manager) {
    
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
    
            List<Contact> results =
                    manager.searchByName(name);
    
            if (results.isEmpty()) {
                System.out.println("No contact found.");
                return;
            }
    
            for (Contact contact : results) {
                System.out.println(contact);
            }
        }
    
     private static void updateContact(ContactManager manager) {
    
            int id = readInt("Enter contact ID: ");
    
            System.out.print("New name: ");
            String name = scanner.nextLine();
    
            System.out.print("New phone: ");
            String phone = scanner.nextLine();
    
            System.out.print("New email: ");
            String email = scanner.nextLine();
    
            boolean updated =
                    manager.updateContact(
                            id,
                            name,
                            phone,
                            email
                    );
    
            if (updated) {
                System.out.println("Contact updated.");
            } else {
                System.out.println("Contact not found.");
            }
        }
    
    private static void deleteContact(ContactManager manager) {
    
            int id = readInt("Enter contact ID: ");
    
            boolean deleted =
                    manager.deleteContact(id);
    
            if (deleted) {
                System.out.println("Contact deleted.");
            } else {
                System.out.println("Contact not found.");
            }
        }
    
    private static int readInt(String message) {
    
            System.out.print(message);
    
            return Integer.parseInt(
                    scanner.nextLine()
            );
        }
     }

