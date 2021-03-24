public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Ivan", 27);
        Person person2 = new Person(2, "Tom", 42);

        WriteObject<Person> writeObject = new WriteObject<>();
        writeObject.writeObject(person1);
        writeObject.writeObject(person2);

        ReadObject<Person> readObject = new ReadObject<>();

        Person person = readObject.readObject();
        Person person3 = readObject.readObject();
        System.out.println(person.toString());
        System.out.println(person3.toString());
    }
}
