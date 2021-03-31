package com.example.listview;

import java.util.ArrayList;

public class ContactRepository {

    private static ContactRepository instance = new ContactRepository();
    private ArrayList<Contact> listContacts = new ArrayList<>();

    public ContactRepository() {

    }

    public ContactRepository(ArrayList<Contact> listContacts) {
        this.listContacts = listContacts;
    }



    public void addContact(Contact contact) {
        listContacts.add(contact);
    }

    public static ContactRepository getInstance(){
        return instance;
    }
}
