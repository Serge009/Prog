package lesson1;

import java.io.Serializable;


public class Human implements Serializable, Cloneable {
    public String name;

    public int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

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
