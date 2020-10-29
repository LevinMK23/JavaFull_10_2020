package lesson5.homework;

public class Person {

    private final String name;
    private final String surname;
    private final String position;
    private final String email;
    private final String phone;
    private final double salary;
    private final int age;

    private Person(PersonBuilder builder) {
        name = builder.name;
        surname = builder.surname;
        position = builder.position;
        email = builder.email;
        phone = builder.phone;
        salary = builder.salary;
        age = builder.age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public static final class PersonBuilder {
        private String name;
        private String surname;
        private String position;
        private String email;
        private String phone;
        private double salary;
        private int age;

        private PersonBuilder() {
        }

        public PersonBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder withSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public PersonBuilder withPosition(String position) {
            this.position = position;
            return this;
        }

        public PersonBuilder withEmail(String email) {
            if (!email.matches("[a-zA-z0-9]+@[a-zA-z0-9]+\\.[a-z]+")) {
                throw new IllegalArgumentException("Bad email address");
            }
            this.email = email;
            return this;
        }

        public PersonBuilder withPhone(String phone) {
            if (!phone.matches("[0-9]+")) {
                throw new IllegalArgumentException("Bad phone number");
            }
            this.phone = phone;
            return this;
        }

        public PersonBuilder withSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public PersonBuilder withAge(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
