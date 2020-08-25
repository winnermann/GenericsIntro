package org.example.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsIntro {
    public static void main(String[] args) {
        /////////Java5/////////////

        //Динамический массив, расширяется при помощи .add();
        List animals = new ArrayList();
        Animal ourAnimal = new Animal();
        animals.add("cat");     //0
        animals.add("dog");     //1
        animals.add("frog");    //2
        animals.add(ourAnimal); //3

        //Downcasting - Нисходящее преобразование
        String animal = (String) animals.get(1);
        System.out.println(animal);


        ///////С появлением Дженериков//////

        //<String> - означает, что в динамический массив ArrayList будут помещаться объекты типа (класса) String
        //В этом массиве ArrayList могут храниться только строки
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");  //0
        animals2.add("dog");  //1
        animals2.add("frog"); //2

        String animal2 = animals2.get(1);
        System.out.println(animal2);


        //////////Java7/////////////
        List<String> animals3 = new ArrayList<>();
        animals3.add("cat");  //0
        animals3.add("dog");  //1
        animals3.add("frog"); //2

        String animal3 = animals3.get(1);
        System.out.println(animal3);
    }
}

class Animal{

}
