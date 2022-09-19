package Singleton;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Locale;

public class Main {
    static Logger LOGGER = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        ClassSingleton a = ClassSingleton.getInstance();
        ClassSingleton b = ClassSingleton.getInstance();
        ClassSingleton c = ClassSingleton.getInstance();
        b.str =(b.str).toUpperCase();
        LOGGER.info("String from b is " + b.str);
        LOGGER.info("String from a is " + a.str);
        LOGGER.info("String from c is " + c.str);
    }
}
