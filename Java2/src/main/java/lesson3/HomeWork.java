package lesson3;

public class HomeWork {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addNumber("Ivan", "891122233344");
        phoneBook.addNumber("Ivan", "891122233345");
        phoneBook.addNumber("Petr", "891122233346");
        System.out.println(phoneBook.getNumbers("Ivan"));
    }
}
