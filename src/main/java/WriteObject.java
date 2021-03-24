import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject <T> {
    public void writeObject(T t){
        try {
            FileOutputStream fos = new FileOutputStream("human.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(t);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
