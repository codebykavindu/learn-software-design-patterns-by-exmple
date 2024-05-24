package creational.builder.person;

/**
 * @author Kavindu Perera
 */
public class Person {
    private final String name;
    private final String address;
    private final int age;

    private Person(Builder builder) {
        this.name = builder.name;
        this.address = builder.address;
        this.age = builder.age;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private String address;
        private int age;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }
}
