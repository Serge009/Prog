package lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static  void main(String[] args) {
        /*

    Написать класс «человек». Реализовать его методы clone, equals, hashCode.
    Реализовать возможность сериализации для класса «человек».
    Написать программу, которая запросит ввести с консоли информацию о 10 людях, запишет ее на диск, а при следующем старте прочитает записи и выведет сохраненные данные на экран. Одинаковые записи должны игнорироваться (Set + equals).
    * Написать проект «Виртуальная файловая система». Каждый каталог и файл представлен одним объектом; вся файловая структура хранится в одном файле.

         */
        try (BufferedReader reader = new BufferedReader(
                                        new InputStreamReader(
                                                System.in))) {
            Human[] humans = new Human[2];

            for (int i = 0; i < humans.length; i++){
                humans[i] = new Human();
                System.out.print("Name: ");
                humans[i].name = reader.readLine();
                System.out.print("Age: ");
                humans[i].age = Integer.parseInt(reader.readLine());
            }

            for (Human human: humans){
                System.out.println(human);
            }
        } catch (IOException e) {
            System.out.println("Wrong argument!");
        }
    }
}
