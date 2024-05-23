package creational.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Kavindu Perera
 */
class Teacher {
    private static final Logger log = LoggerFactory.getLogger(Teacher.class);

    // teacherInstance is the one true instance of Teacher
    private static Teacher teacherInstance;

    //Constructor is private to prevent instantiation (creation of new Teacher) from outside
    private Teacher() {}

    // getTeacherInstance() is the only way to get the instance of Teacher
    public static Teacher getTeacherInstance() {
        // If teacherInstance is null, create a new Teacher
        if (teacherInstance == null) {
            teacherInstance = new Teacher();
        }
        return teacherInstance;
    }

    // Teacher can do stuff..
    public void teach() {
        log.info("Teaching...");
    }
}
