package com.bridgelabz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBookSystem {
    ArrayList<Contacts> contactDetails = new ArrayList();
    Scanner sc = new Scanner(System.in);
    public void addDetails(){
        Contacts info = new Contacts();
        System.out.println("Enter first name: ");
        info.setFirstName(sc.nextLine());
        System.out.println("Enter last name: ");
        info.setLastName(sc.nextLine());
        System.out.println("Enter address: ");
        info.setAddress(sc.nextLine());
        System.out.println("Enter city name: ");
        info.setCity(sc.nextLine());
        System.out.println("Enter state name: ");
        info.setState(sc.nextLine());
        System.out.println("Enter zip code: ");
        info.setZipCode(sc.nextLine());
        System.out.println("Enter contact no.: ");
        info.setContactNo(sc.nextLine());
        System.out.println("Enter email: ");
        info.setEmail(sc.nextLine());
        contactDetails.add(info);
        System.out.println("Contact details added!");
    }
    public void displayContacts(){
        for (Contacts contactDetailsValue : contactDetails){
            System.out.println(contactDetailsValue);
        }
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
            }
            else {
                System.out.println("No record found!");
            }
        }
        /*  Display updated contact */
        System.out.println("Updated Details: ");
        displayContacts();
    }
    public void deleteContact(){
        Iterator<Contacts> removeContact = contactDetails.iterator();
        /*  Checking the next element where
        *   condition holds true till there is single element
        *   in the List using hasnext() method
        */
        while (removeContact.hasNext()){
            /*  Move cursor to next element */
            Contacts nextElement = removeContact.next();
            removeContact.remove();
        }
        System.out.println("Contact is removed!");
        displayContacts();
    }
    public static void displayActionMenu(AddressBookSystem addressDetails){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to perform action: \n1. Add details \n2. Edit details \n3. Delete details \n4. Display details \n5. Exit");
        int selectMenuOption = sc.nextInt();
        do {
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
    public static void main(String[] args) {
        AddressBookSystem addressDetails = new AddressBookSystem();
        displayActionMenu(addressDetails);
//        AddressBookSystem addressOfPerson1 = new AddressBookSystem();
//        addressOfPerson1.addDetails();
//        addressOfPerson1.displayContacts();
//        addressOfPerson1.editDetails();
//        addressOfPerson1.deleteContact();
    }
}