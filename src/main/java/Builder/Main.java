package Builder;

public class Main {
     public static void main(String[] args) {
          Person person = new PersonBuilderImpl().setName("Dana").setAge(25).build();
          System.out.println(person.toString());
          Person person2 = new PersonBuilderImpl().setName("Dana2").setAge(25).setSalary(232).setCatName("Jon").build();
          person2.print();
}}
