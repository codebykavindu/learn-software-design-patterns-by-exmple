package creational.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Kavindu Perera
 */
class Demo {
    private static final Logger log = LoggerFactory.getLogger(Demo.class);

    public static void main(String[] args) {
        var teacher1 = Teacher.getTeacherInstance();
        var teacher2 = Teacher.getTeacherInstance();

        log.info("{}", teacher1);
        log.info("{}", teacher2);
        log.info("Are both teachers the same instance? {}", teacher1 == teacher2);
    }
}
