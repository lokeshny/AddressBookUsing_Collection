package com.bl.addressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    ArrayList<Contact> person = new ArrayList<Contact>();

    public void createContact() {
        Contact contact = new Contact();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Name: ");
        String firstName = scanner.nextLine();
        contact.setFirstName(firstName);

        System.out.println("Enter Last Name: ");
        String lastName = scanner.nextLine();
        contact.setLastName(lastName);

        System.out.println("Enter E-mail: ");
        String email = scanner.nextLine();
        contact.setEmail(email);

        System.out.println("Enter Address: ");
        String address = scanner.nextLine();
        contact.setAddress(address);

        System.out.println("Enter City: ");
        String city = scanner.nextLine();
        contact.setCity(city);

        System.out.println("Enter State: ");
        String state = scanner.nextLine();
        contact.setState(state);

        System.out.println("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();
        contact.setPhoneNo(phoneNumber);

        System.out.println("Enter Zip: ");
        String zip = scanner.nextLine();
        contact.setZip(zip);

        person.add(contact);
        System.out.println("Contact Added Successfully");
        System.out.println(person.toString());
    }

    public static void main(String[] args) {
        //AddressBookMain object created
        AddressBookMain book = new AddressBookMain();
        //method calling
        book.createContact();
    }
}
