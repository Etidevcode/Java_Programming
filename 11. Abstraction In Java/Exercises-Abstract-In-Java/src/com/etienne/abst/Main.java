package com.etienne.abst;

public class Main {

    public static void main(String[] args) {
        SearchTree tree = new SearchTree(new Node("1"));
        tree.addItem(new Node("2"));
        tree.addItem(new Node("3"));
        tree.addItem(new Node("4"));
        tree.addItem(new Node("5"));
        tree.addItem(new Node("6"));
        tree.addItem(new Node("7"));
        tree.addItem(new Node("8"));
        tree.traverse(tree.getRoot());

        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());

        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String[] data = stringData.split(" ");
        for (String s : data) {
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());
    }
}
