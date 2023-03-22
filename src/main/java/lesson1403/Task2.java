package lesson1403;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Task2 {
//    2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
    public static void main(String[] args) {
        List<String> fruitsList = new LinkedList<>();
        Collections.addAll(fruitsList, "apple", "banana", "peach", "pear", "orange", "apple", "banana",
                "peach", "pear", "orange", "apple", "banana", "peach", "pear",
                "orange", "apple", "banana", "peach", "pear", "orange");

        System.out.println(reverseList(fruitsList));
    }

    static List reverseList(List<String> linkedList) {
        List<String> revers = new LinkedList<>();
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            revers.add(linkedList.get(i));
        }
        return revers;
    }
}
