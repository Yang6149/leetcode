package temp;

import java.io.*;
import java.util.Date;

public class Serializ {
    private static final File f=new File("D:"+File.separator+"object.user");

    public static void writeObject(Object o) throws IOException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(f));
        oos.writeObject(o);
        oos.close();

    }
    public static void readObject() throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(f));
        Object o=ois.readObject();
        System.out.println(o);
        ois.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User u=new User();
        u.setAge(7);
        u.setDate(new Date());
        u.setName("name");
        u.setPassword("this is password");
        writeObject(u);
        readObject();
    }
}
