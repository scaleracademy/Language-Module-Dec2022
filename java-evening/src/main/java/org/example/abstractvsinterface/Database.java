package org.example.abstractvsinterface;

public class Database {
    Storage storage;

    public Database(Storage storage) {
        this.storage = storage;
    }

    public void addItem(String item) {
        var storedList = storage.retrieve();
        storedList.add(item);
        storage.store(storedList);
    }

    public void removeItem(String item) {
        var storedList = storage.retrieve();
        storedList.remove(item);
        storage.store(storedList);
    }

    public void printItems() {
        if (storage.isEmpty()) {
            System.out.println("No items in storage");
            return;
        }
        var storedList = storage.retrieve();
        storedList.forEach(System.out::println);
    }
}
