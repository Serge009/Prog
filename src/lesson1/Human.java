package lesson1;

import java.io.Serializable;

/**
 * Created by SERGE on 05.03.14.
 */
public class Human implements Serializable, Cloneable {
    public String name;

    public int age;

    Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    Human(){
        this.name = "Noname";
        this.age = 20;
    }

    @Override
    public Human clone() throws CloneNotSupportedException{
        Human res = (Human) super.clone();
        res.name = this.name;
        res.age = this.age;
        return res;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString() + "@name: " + name + "@age: " + age;
    }
}
