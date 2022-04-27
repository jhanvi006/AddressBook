package com.bridgelabz;

import java.util.ArrayList;

class Contacts{
    private String firstName, lastName, address, city, state, zipCode, contactNo, email;
    public Contacts(String fName, String lName,
                    String addr, String cityName, String stateName,
                    String zipCodeNo, String contact, String emailAddr){
        this.firstName = fName;
        this.lastName = lName;
        this.address = addr;
        this.city = cityName;
        this.state = stateName;
        this.zipCode = zipCodeNo;
        this.contactNo = contact;
        this.email = emailAddr;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getEmail(){
        return email;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
}
public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program!");
        Contacts contacts = new Contacts("Krishna", "Patel", "MG Road", "Mumbai", "Maharashtra","400001", "9988776655","kp@hotmail.com");
//        contact1.setFirstName("Jhanvi");
        System.out.println(contacts.getFirstName());
        System.out.println(contacts.getEmail());
    }
}
