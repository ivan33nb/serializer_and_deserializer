import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject<T> {
    public Person readObject(){
        try {
            FileInputStream fis = new FileInputStream("human.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            return (Person) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
