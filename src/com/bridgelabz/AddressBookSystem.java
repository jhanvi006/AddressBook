package com.bridgelabz;

import java.util.ArrayList;
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
    }
    public void displayContacts(){
        System.out.println(contactDetails);
    }
    public void editDetails(String searchFirstName){
        for (Contacts contact : contactDetails) {
            System.out.println("First name: "+contact.getFirstName());
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
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBookSystem addressOfPerson1 = new AddressBookSystem();
        addressOfPerson1.addDetails();
        addressOfPerson1.displayContacts();
        System.out.println("Enter First Name for which you want to modify info: ");
        String fName = sc.nextLine();
        addressOfPerson1.editDetails(fName);
        System.out.println("Updated Details: ");
        addressOfPerson1.displayContacts();
    }
}
