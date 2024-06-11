package dev.lpa;


import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        List<Contact> emails = ContactData.getData("email");
        List<Contact> phones = ContactData.getData("phone");
        printData("Phone List", phones);
        printData("Email List", emails);

        Set<Contact> emailContacts = new HashSet<>(emails);
        Set<Contact> phoneContacts = new HashSet<>(phones);
        printData("Phone Contacts", emailContacts);
        printData("Email Contacts", phoneContacts);

         int index = emails.indexOf(new Contact("Robin Hood"));
        Contact robinHood = emails.get(index);
        robinHood.addEmlail("Sherwood Forest");
        robinHood.addEmlail("Sherwood Forest");
        robinHood.replaceEmailIfExists("RHood@Sherwoodforest.com",
                "RHood@sherwoodforest.org");
        System.out.println(robinHood);

        Set<Contact> unionAB = new HashSet<>();
        unionAB.addAll(emailContacts);
        unionAB.addAll(phoneContacts);
        printData("(A ∪ b) Union of emails (A) with phones (B)", unionAB); // \u222A == Union

        Set<Contact> intersectAB = new HashSet<>(emailContacts);
        intersectAB.retainAll(phoneContacts);
        printData("(A ∩ B) Intersect emails (A) and phones (B)", intersectAB); // \u2229 == Intersection

        Set<Contact> intersectBA = new HashSet<>(phoneContacts);
        intersectBA.retainAll(phoneContacts);
        printData("(B ∩ A) Intersect emails (B) and phones (A)", intersectBA);

        Set<Contact> AMinusB = new HashSet<>(emailContacts);
        AMinusB.retainAll(phoneContacts);
        printData("(A - B)  emails (A) - phones (B)", AMinusB);

        Set<Contact> BMinusA = new HashSet<>(phoneContacts);
        BMinusA.retainAll(phoneContacts);
        printData("(B - A) phones (B) - phones (A)", BMinusA);

        Set<Contact> symmetricDiff = new HashSet<>(AMinusB);
        symmetricDiff.addAll(BMinusA);
        printData("Symmetric Difference phones and emails", symmetricDiff);

        Set<Contact> symmetricDiff2 = new HashSet<>(unionAB);
        symmetricDiff2.removeAll(intersectAB);
        printData("Symmetric Difference: phones and emails", symmetricDiff2);

    }

    public static void printData(String header, Collection<Contact> contacts) {

        System.out.println("-".repeat(60));
        System.out.println(header);
        System.out.println("-".repeat(60));
        contacts.forEach(System.out::println);
    }
}
