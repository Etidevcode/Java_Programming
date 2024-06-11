package dev.lpa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {

        List<Contact> phones = ContactData.getData("phone");
        List<Contact> emails = ContactData.getData("email");

        List<Contact> fullList = new ArrayList<>(phones);
        fullList.addAll(emails);
        fullList.forEach(System.out::println);
        System.out.println();

        Map<String, Contact> contacts = new HashMap<>();

        for (Contact contact : fullList) {
            contacts.put(contact.getName(), contact);
        }
        contacts.forEach((k, v) -> System.out.println("Key = " + k + ", value = " + v));
        System.out.println("-".repeat(90));
        System.out.println(contacts.get("Charlie Brown"));
        System.out.println(contacts.get("Chuck Brown"));

        Contact defaultContact = new Contact("Chuck Brown");
        System.out.println(contacts.getOrDefault("Chuck Brown", defaultContact));

        System.out.println("-".repeat(90));
        contacts.clear();
        for (Contact contact : fullList) {
            Contact duplicate = contacts.put(contact.getName(), contact);
            if (duplicate != null) {
                //System.out.println("duplicate = " + duplicate);
                //System.out.println("current = " + contact);
                contacts.put(contact.getName(), contact.meargeContactData(duplicate));
            }
        }
        contacts.forEach((k, v) -> System.out.println("Key = " + k + ", value = " + v));

        System.out.println("-".repeat(90));
        contacts.clear();

        for (Contact contact : fullList) {
            contacts.putIfAbsent(contact.getName(), contact);
        }
        contacts.forEach((k, v) -> System.out.println("Key = " + k + ", value = " + v));

        System.out.println("-".repeat(90));
        contacts.clear();

        for (Contact contact : fullList) {
            Contact duplicate = contacts.putIfAbsent(contact.getName(), contact);
            if (duplicate != null) {
                contacts.put(contact.getName(), contact.meargeContactData(duplicate));
            }
        }
        contacts.forEach((k, v) -> System.out.println("Key = " + k + ", value = " + v));

        System.out.println("-".repeat(90));
        contacts.clear();
        fullList.forEach(contact -> contacts.merge(contact.getName(), contact, Contact::meargeContactData
                /*(previous, current) -> {
                    System.out.println("prev: " + previous + " : current" + current);
                    Contact merged = previous.meargeContactData(current);
                    System.out.println("merged: " + merged);
                    return merged;
                }*/

        // (previous, current) -> previous.meargeContactData(current) OU


        ));
        contacts.forEach((k, v) -> System.out.println("Key = " + k + ", value = " + v));

        System.out.println("-".repeat(90));
        for (String contactName : new String[] {"Daisy Duck", "Daffy Duck", "Scrooge McDuck"}) {
            //contacts.compute(contactName, (k, v) -> new Contact(k));
            contacts.computeIfAbsent(contactName, k -> new Contact(k));
        }

        contacts.forEach((k, v) -> System.out.println("Key = " + k + ", value = " + v));

        System.out.println("-".repeat(90));
        for (String contactName : new String[] {"Daisy Duck", "Daffy Duck", "Scrooge McDuck"}) {
            //contacts.compute(contactName, (k, v) -> new Contact(k));
            //contacts.computeIfAbsent(contactName, k -> new Contact(k));
            contacts.computeIfPresent(contactName, (k, v) -> {
                v.addEmlail("Fun Place"); return v;
            });
        }

        contacts.forEach((k, v) -> System.out.println("Key = " + k + ", value = " + v));

        System.out.println("-".repeat(90));
        contacts.replaceAll((k, v) -> {
            String newEmail = k.replaceAll(" " , "") + "@funbplace.com";
            v.replaceEmailIfExists("DDuck@funplace.com", newEmail);
            return v;
        });
        contacts.forEach((k, v) -> System.out.println("Key = " + k + ", value = " + v));

        System.out.println("-".repeat(90));
        Contact daisy = new Contact("Daisy Jane Duck", "daisyj@duck.com");

        Contact replacedContact = contacts.replace("Daisy Duck", daisy);
        System.out.println("daisy = " + daisy);
        System.out.println("replacedContact = " + replacedContact);
        contacts.forEach((k, v) -> System.out.println("Key = " + k + ", value = " + v));

        System.out.println("-".repeat(90));
        Contact updatedDaisy = replacedContact.meargeContactData(daisy);
        System.out.println("updatedDaisy = " + updatedDaisy);
        boolean success = contacts.replace("Daisy Duck", daisy , updatedDaisy); // replace replacedContact to daisy
        if (success) {
            System.out.println("Successfully replaced element");
        } else {
            System.out.printf("Did not match on both key : %s and value: %s %n"
                    .formatted("Daisy Duck", replacedContact));
        }
        contacts.forEach((k, v) -> System.out.println("Key = " + k + ", value = " + v));

        System.out.println("-".repeat(90));
        success = contacts.remove("Daisy Duck", daisy);
        if (success) {
            System.out.println("Successfully removed element");
        } else {
            System.out.printf("Did not match on both key : %s and value: %s %n"
                    .formatted("Daisy Duck", daisy));
        }
        contacts.forEach((k, v) -> System.out.println("Key = " + k + ", value = " + v));


    }
}
