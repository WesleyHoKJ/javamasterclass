# Day 5 Assignment


## Load Contacts
This method uses a BufferedReader to read the contents of the file and stores the information in the ArrayList of Contact objects. If the file does not exist, the method returns without doing anything. If there is an error reading the file, it displays an error message.  

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

## Here is the code for the saveContacts method:

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

This method uses a FileWriter to write the contents of the ArrayList of Contact objects to the file. If there is an error saving the file, it displays an error message. The write method is called for each Contact object in the ArrayList, and the \n character is added at the end to indicate a new line in the file.  

## Here is the code for the deleteContact method:

    static void deleteContact(String name) {
        Iterator<Contact> it = contacts.iterator();
        while (it.hasNext()) {
            Contact c = it.next();
            if (c.name.equals(name)) {
                it.remove();
                System.out.println("Contact '" + name + "' deleted.");
                return;
            }
        }
        System.out.println("Contact '" + name + "' not found.");
    }

This method uses an iterator to go through the ArrayList of Contact objects and remove the Contact with the specified name. If the contact is found, it is removed from the list and a message indicating that the contact was deleted is displayed. If the contact is not found, a message indicating that the contact was not found is displayed.  

## Here is the code for the Contact class:

    class Contact {
        String name;
        String address;
        String phone;
        
        Contact(String name, String address, String phone) {
            this.name = name;
            this.address = address;
            this.phone = phone;
        }
    }

This class is a simple data structure to store information about a contact, including the name, address, and phone number. The constructor takes three parameters, which are used to initialize the fields of the Contact object.  
