package Builder;

import Singleton.Main;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Person {
    static Logger LOGGER = LogManager.getLogger(Person.class);
    String name;
    int age;
    double salary;
    String catName;
    public void print(){
        LOGGER.info(name + " " + age +" " + salary + " " + catName );
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", catName='" + catName + '\'' +
                '}';
    }
}
