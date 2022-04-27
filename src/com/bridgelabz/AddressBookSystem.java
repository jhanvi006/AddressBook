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
    public static void main(String[] args) {
        AddressBookSystem addressOfPerson1 = new AddressBookSystem();
        addressOfPerson1.addDetails();
        addressOfPerson1.displayContacts();
    }
}
