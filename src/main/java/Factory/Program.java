package Factory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static final Logger LOGGER = LogManager.getLogger(Program.class);

    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpecialty();
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpecialty() {
        String specialty;
        Scanner input = new Scanner(System.in);
        LOGGER.info("Enter which specialty do you need to create a developer");
        specialty = input.next();
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("scala")) {
            return new ScalaDeveloperFactory();
        } else {
            throw new RuntimeException("Sorry but we don`t have such type of developer");
        }
    }

}
