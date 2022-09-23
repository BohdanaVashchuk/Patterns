package Builder;

public interface PersonBuilder {
    PersonBuilder setName(String name);
    PersonBuilder setAge(int age);
    PersonBuilder setSalary(double salary);
    PersonBuilder setCatName(String catName);
    Person build();

}
