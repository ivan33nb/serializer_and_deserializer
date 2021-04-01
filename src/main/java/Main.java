import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person [] people = {new Person(1, "Ivan", 27), new Person(2, "Tom", 42)};

        FileOutputStream fos = new FileOutputStream("human.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeInt(people.length);
        oos.writeObject(people);
        fos.close();

        FileInputStream fis = new FileInputStream("human.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Person [] peopleFromFile = new Person[ois.readInt()];
        peopleFromFile = (Person[]) ois.readObject();

        System.out.println(Arrays.toString(peopleFromFile));
    }
}
