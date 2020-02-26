package temp;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    public static int a=0;
    private String name;
    private String Password;
    private int age;
    private Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", Password='" + Password + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }
}
