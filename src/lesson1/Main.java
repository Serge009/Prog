package lesson1;

/**
 * Created by SERGE on 05.03.14.
 */
public class Main {
    public static  void main(String[] args) throws CloneNotSupportedException {
        /*

    Написать класс «человек». Реализовать его методы clone, equals, hashCode.
    Реализовать возможность сериализации для класса «человек».
    Написать программу, которая запросит ввести с консоли информацию о 10 людях, запишет ее на диск, а при следующем старте прочитает записи и выведет сохраненные данные на экран. Одинаковые записи должны игнорироваться (Set + equals).
    * Написать проект «Виртуальная файловая система». Каждый каталог и файл представлен одним объектом; вся файловая структура хранится в одном файле.

         */
        Human human1 = new Human("Name", 100);
        Human human2 = human1.clone();
        human2.name = "Other";
        System.out.println(human1);
        System.out.println(human2);

    }
}
