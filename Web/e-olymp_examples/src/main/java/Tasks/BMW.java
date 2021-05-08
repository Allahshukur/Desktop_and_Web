package Tasks;

import java.io.*;

public class Test implements Serializable {

    public  String name;
    public  String surname;


    public String getName() {
        return name;
    }

    public Test setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Test setSurname(String surname) {
        this.surname = surname;
        return this;
    }
}
