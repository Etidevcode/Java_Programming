package dev.lpa;

import java.util.*;

public class MapViewMain {
    public static void main(String[] args) {

        Map<String, Contact> contacts = new HashMap<>();
        ContactData.getData("phone").forEach(c -> contacts.put(c.getName(), c));
        ContactData.getData("email").forEach(c -> contacts.put(c.getName(), c));

        Set<String> keysView = contacts.keySet();
        System.out.println(keysView);
        System.out.println("--".repeat(60));

        Set<String> copyOfKeys = new TreeSet<>(contacts.keySet());
        System.out.println(copyOfKeys);
        System.out.println("--".repeat(60));

        if (contacts.containsKey("Linus Van Pelt")) {
            System.out.println("Linus and I go way back, so of course I have info");
        }
        System.out.println("--".repeat(60));

        keysView.remove("Daffy Duck");
        System.out.println(keysView);
        System.out.println("--".repeat(60));
        contacts.forEach((k, v) -> System.out.println(v));

        System.out.println("--".repeat(60));
        copyOfKeys.remove("Linus Van Pelt");
        contacts.forEach((k, v) -> System.out.println(v));

        System.out.println("--".repeat(60));

        keysView.retainAll(List.of("Linus Van Pelt", "Charlie Brown", "Robbin Hood", "Mickey Mouse"));
        System.out.println(keysView);
        System.out.println("--".repeat(60));
        contacts.forEach((k, v) -> System.out.println(v));

        System.out.println("--".repeat(60));
        keysView.clear();
        System.out.println(contacts);

        System.out.println("--".repeat(60));
        ContactData.getData("phone").forEach(c -> contacts.put(c.getName(), c));
        ContactData.getData("email").forEach(c -> contacts.put(c.getName(), c));
        System.out.println(keysView);

        System.out.println("--".repeat(60));
        var values = contacts.values();
        values.forEach(System.out::println);

        System.out.println("--".repeat(60));
        values.retainAll(ContactData.getData("email"));
        System.out.println(keysView);
        contacts.forEach((k, v) -> System.out.println(v));

        System.out.println("--".repeat(60));
        List<Contact> list = new ArrayList<>(values);
        list.sort(Comparator.comparing(Contact::getNameLastFirst));
        list.forEach(c -> System.out.println(c.getNameLastFirst() + ": " + c));

        System.out.println("--".repeat(60));
        Contact first = list.get(0);
        contacts.put(first.getNameLastFirst(), first);
        values.forEach(System.out::println);
        System.out.println("--".repeat(60));
        keysView.forEach(System.out::println);


        System.out.println("--".repeat(60));
        HashSet<Contact> set = new HashSet<>(values);
        set.forEach(System.out::println);
        if (set.size() < contacts.size()) {
            System.out.println("Duplicate Values are in my Map");
        }

        System.out.println("--".repeat(60));
        var nodeSet = contacts.entrySet();
        for (var node : nodeSet) {
            System.out.println(nodeSet.getClass().getName());
            if (!node.getKey().equals(node.getValue().getName())) {
                System.out.println(nodeSet.getClass().getName());
                System.out.println("Key doesn't match name: " + node.getKey() + ": " +
                        node.getValue());
            }
        }

    }
}
