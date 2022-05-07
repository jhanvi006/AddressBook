package com.bridgelabz;

import java.util.*;

public class AddressBookSystem {
    static ArrayList<Contacts> contactDetails = new ArrayList();
    static Scanner sc = new Scanner(System.in);
    public static ArrayList<Contacts> addDetails(){
        Contacts info = new Contacts();
        System.out.println("Enter first name: ");
        info.setFirstName(sc.next());
        System.out.println("Enter last name: ");
        info.setLastName(sc.next());
        System.out.println("Enter address: ");
        info.setAddress(sc.next());
        System.out.println("Enter city name: ");
        info.setCity(sc.next());
        System.out.println("Enter state name: ");
        info.setState(sc.next());
        System.out.println("Enter zip code: ");
        info.setZipCode(sc.next());
        System.out.println("Enter contact no.: ");
        info.setContactNo(sc.next());
        System.out.println("Enter email: ");
        info.setEmail(sc.next());
        contactDetails.add(info);
        System.out.println("Contact details added!");
        return contactDetails;
    }
    public void displayContacts(){
        /*for (Contacts contactDetailsValue : contactDetails){
            System.out.println(contactDetailsValue);
            System.out.println("-----------------------------");
        }*/
        System.out.println(Arrays.asList(addressBookList));
    }
    public void editDetails(){
        System.out.println("Enter First Name for which you want to modify info: ");
        String searchFirstName = sc.nextLine();
        /*  Iterate to search for first name */
        for (Contacts contact : contactDetails) {
            /*  compare first name
            *   if matches display menu for edit
            *   else display no record found message
            */
            if (contact.getFirstName().equals(searchFirstName)){
                System.out.println("Enter the number to edit respective info: ");
                System.out.println("1. First Name \n2. Last Name \n3. Address \n4. City " +
                        "\n5. State \n6. Zip Code \n7. Contact No \n8. Email");
                int index = sc.nextInt();
                System.out.println("Enter value to update: ");
                switch (index){
                    case 1:
                        String updatedFirstName = sc.next();
                        contact.setFirstName(updatedFirstName);
                        break;
                    case 2:
                        String updatedLastName = sc.next();
                        contact.setLastName(updatedLastName);
                        break;
                    case 3:
                        String updatedAddress = sc.next();
                        contact.setAddress(updatedAddress);
                        break;
                    case 4:
                        String updatedCity = sc.next();
                        contact.setCity(updatedCity);
                        break;
                    case 5:
                        String updatedState = sc.next();
                        contact.setState(updatedState);
                        break;
                    case 6:
                        String updatedZipCode = sc.next();
                        contact.setZipCode(updatedZipCode);
                        break;
                    case 7:
                        String updatedContact = sc.next();
                        contact.setContactNo(updatedContact);
                        break;
                    case 8:
                        String updatedEmail = sc.next();
                        contact.setEmail(updatedEmail);
                        break;
                    default:
                        System.out.println("Invalid number!");
                }
                /*  Display updated contact */
                System.out.println("Details updated");
            }
            else {
                System.out.println("No record found!");
            }
        }
    }
    public void deleteContact(){
        System.out.println("Enter email for which you want to delete contact: ");
        String searchEmail = sc.nextLine();
        Iterator<Contacts> removeContact = contactDetails.iterator();
        /*  Checking the next element where
        *   condition holds true till there is single element
        *   in the List using hasNext() method
        */
        while (removeContact.hasNext()){
            /*  Move cursor to next element */
            Contacts nextElement = removeContact.next();
            if (nextElement.getEmail().equals(searchEmail)) {
                removeContact.remove();
                System.out.println("Contact is removed!");
                break;
            }
            else {
                System.out.println("Contact not found.");
            }
        }
    }
    public static void displayActionMenu(AddressBookSystem addressDetails){
        int selectMenuOption;
        do {
            System.out.println("Enter a number to perform action: \n1. Add details \n2. Edit details \n3. Delete details \n4. Display details \n5. Exit");
            selectMenuOption = sc.nextInt();

            switch (selectMenuOption) {
                case 1:
                    /*  Add contact details in address book */
                    addressDetails.addDetails();
                    break;
                case 2:
                    /*  Edit contact details in address book */
                    addressDetails.editDetails();
                    break;
                case 3:
                    /*  Delete contact details */
                    addressDetails.deleteContact();
                    break;
                case 4:
                    /*  Display contact details */
                    addressDetails.displayContacts();
                    break;
                case 5:
                    System.out.println("Exit!");
                    break;
                default:
                    System.out.println("Invalid option selected.");
                    break;
            }
        }while (selectMenuOption != 5);
    }
    static HashMap<String, ArrayList<Contacts>> addressBookList = new HashMap<>();
    public static void createAddressBook(AddressBookSystem addressDetails){
        char choice = 'Y';
        String addressBookName;
        do {
            System.out.println("Enter name of Address Book: ");
            addressBookName = sc.next();
            if (addressBookList.containsKey(addressBookName))
                System.out.println("Address Book with "+addressBookName+" name already exists.");
            else {
                addressBookList.put(addressBookName, addDetails());
                displayActionMenu(addressDetails);
            }
            System.out.println("To continue press Y otherwise press N");
            choice = sc.next().charAt(0);
        }while (choice != 'n' && choice != 'N');
    }
    public static void main(String[] args) {
        AddressBookSystem addressDetails = new AddressBookSystem();
        createAddressBook(addressDetails);
    }
}