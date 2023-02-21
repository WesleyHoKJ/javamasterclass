package Day5Assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day5Assignment {

    static ArrayList<Contact> contacts = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static final String FILENAME = "src/Day5Assignment/contacts.txt";

    public static void main(String[] args) {
        loadContacts();
        int choice;
        do {
            System.out.println("1. View contacts");
            System.out.println("2. Search contact");
            System.out.println("3. Add contact");
            System.out.println("4. Edit contact");
            System.out.println("5. Save contact");
            System.out.println("6. Load contact");
            System.out.println("7. Delete contact");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    viewContacts();
                    break;
                case 2:
                    searchContact();
                    break;
                case 3:
                    addContact();
                    break;
                case 4:
                    editContact();
                    break;
                case 5:
                    saveContacts();
                    break;
                case 6:
                    loadContacts();
                    break;
                case 7:
                    deleteContact();
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);
        saveContacts();
    }

    static void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts to display.");
            return;
        }
        System.out.println("Name\tAddress\t\tPhone");
        for (Contact c : contacts) {
            System.out.println(c.name + "\t" + c.address + "\t" + c.phone);
        }
    }

    static void searchContact() {
        System.out.print("Enter name to search: ");
        String name = sc.nextLine();
        boolean found = false;
        for (Contact c : contacts) {
            if (c.name.equalsIgnoreCase(name)) {
                System.out.println("Name\tAddress\t\tPhone");
                System.out.println(c.name + "\t" + c.address + "\t" + c.phone);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Contact not found.");
        }
    }

    static void addContact() {
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter address: ");
        String address = sc.nextLine();
        System.out.print("Enter phone: ");
        String phone = sc.nextLine();
        contacts.add(new Contact(name, address, phone));
    }

    static void editContact() {
        System.out.print("Enter Name to edit:");
        String nameToEdit = sc.nextLine();

        System.out.print("Enter New Name:");
        String newName = sc.nextLine();
        System.out.print("Enter Email New Address:");
        String newAddress = sc.nextLine();
        System.out.print("Enter New Phone:");
        String newPhone = sc.nextLine();

        Contact newContact= new Contact(newName,newAddress,newPhone);
        for (int i=0;i<contacts.size();i++) {
            System.out.println(" '" + nameToEdit + "' " + " '" + contacts.get(i).name + "'");
            if(nameToEdit.equalsIgnoreCase(contacts.get(i).name)){
                contacts.set(i, newContact);
                System.out.println("matched");
            }
        }
    }

    static void loadContacts() {
        File file = new File(FILENAME);
        if (!file.exists()) {
            return;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split("\t");
                contacts.add(new Contact(data[0], data[1], data[2]));
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
    

    static void deleteContact() {
        System.out.print("Enter Name to delete:");
        String nameToEdit = sc.nextLine();
        for (int i=0;i<contacts.size();i++) {
            if(nameToEdit.equalsIgnoreCase(contacts.get(i).name)){
                contacts.remove(i);
                System.out.println("deleted");
            }
        }
        System.out.println("Delete Contacts");
    }

    static void saveContacts() {
        File file = new File(FILENAME);
        try (FileWriter fw = new FileWriter(file)) {
            for (Contact c : contacts) {
                fw.write(c.name + "\t" + c.address + "\t" + c.phone + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }

}

