package lesson5.homework;

public class Test {
    public static void main(String[] args) {
        // pattern builder
        Person person = Person.builder()
                .withAge(12)
                .withEmail("fdgd@dgsd.ru")
                .withPhone("8911154545")
                .withSalary(100500)
                .withName("Ivan")
                .withSurname("Ivanov")
                .withPosition("developer")
                .build();
        System.out.println(person);
    }
}
