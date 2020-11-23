package lesson3;

import java.util.Collection;
import java.util.HashMap;
import java.util.TreeSet;

public class PhoneBook {

    private HashMap<String, TreeSet<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void addNumber(String name, String number) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, new TreeSet<>());
        }
        phoneBook.get(name).add(number);
    }

    public Collection<String> getNumbers(String name) {
        return phoneBook.get(name);
    }
}
