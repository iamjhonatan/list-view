package com.example.listview;

import java.util.Objects;

public class Contact {

    private String name;
    private String address;
    private String phone;
    //private EnumType type;

    public Contact(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return name.equals(contact.name) &&
                address.equals(contact.address) &&
                phone.equals(contact.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, phone);
    }
}
