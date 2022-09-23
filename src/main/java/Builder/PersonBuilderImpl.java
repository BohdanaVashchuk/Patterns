package Builder;

public class PersonBuilderImpl implements PersonBuilder{
    Person person = new Person();
    @Override
    public PersonBuilder setName(String name) {
        person.name = name;
        return this;
    }

    @Override
    public PersonBuilder setAge(int age) {
        person.age = age;
        return this;
    }

    @Override
    public PersonBuilder setSalary(double salary) {
        person.salary = salary;
        return this;
    }

    @Override
    public PersonBuilder setCatName(String catName) {
        person.catName = catName;
        return this;
    }

    @Override
    public Person build() {
        return person;
    }
}
