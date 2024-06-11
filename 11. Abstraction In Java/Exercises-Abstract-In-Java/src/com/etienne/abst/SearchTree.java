package com.etienne.abst;

public class SearchTree implements NodeList{

    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            this.root = newItem;
            return true;
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(newItem);
            if (comparison < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem);
                    return true;
                }
            } else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                    currentItem.setPrevious(newItem);
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (this.root != null) {
            performRemoval(item, this.root);
        }
        return false;
    }

    private void performRemoval(ListItem item, ListItem parent) {
        if (item != null) {
            int comparison = parent.compareTo(item);
            if (comparison < 0) {
                if (parent.next() != null) {
                    if (parent.next().compareTo(item) == 0) {
                        parent.setNext(parent.next().next());
                    } else {
                        performRemoval(item, parent.next());
                    }
                }
            } else if (comparison > 0) {
                if (parent.previous() != null) {
                    if (parent.previous().compareTo(item) == 0) {
                        parent.setPrevious(parent.previous().previous());
                    } else {
                        performRemoval(item, parent.previous());
                    }
                }
            }
        }
    }

    @Override
    public void traverse(ListItem root) {
        if (root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}
