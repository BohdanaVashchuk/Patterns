package Singleton;

public class ClassSingleton {
    private static ClassSingleton instance;
    public String str;
    private ClassSingleton() {
        str = "Some text in singleton";
    }
    public static ClassSingleton getInstance() {
        if(instance == null) {
            instance = new ClassSingleton();
        }
        return instance;
    }
}
