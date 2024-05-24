package creational.builder;

import creational.builder.person.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Kavindu Perera
 */
public class Demo {
    private static final Logger log = LoggerFactory.getLogger(Demo.class);

    public static void main(String[] args) {
        Person person = Person.builder()
                .name("Kavindu")
                .address("Sri Lanka")
                .age(25)
                .build();

        log.info("Name: {}", person.getName());
        log.info("Address: {}", person.getAddress());
        log.info("Age: {}", person.getAge());
    }
}

