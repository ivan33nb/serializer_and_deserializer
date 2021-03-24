import java.io.Serializable;

public class Person implements Serializable {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return String.format("Person id - %d, name is - %s, age is - %d", id, name, age);
    }
}
