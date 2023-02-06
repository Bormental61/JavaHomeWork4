package JavaHw4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
/*
Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
 */


public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (Integer temp : randomList(10)) {
            linkedList.add(temp);
        }
        System.out.println("Original LinkedList = " + linkedList);
        reversedList(linkedList);
        System.out.println("Reversed LinkedList = " + linkedList);
    }

    public static List<Integer> randomList(int size) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(10));
        }
        return list;
    }

    public static LinkedList<Integer> reversedList(LinkedList<Integer> linkedList) {
        int temp = 0;
        while (temp != linkedList.size() - 1) {
            linkedList.add(linkedList.size() - temp, linkedList.getFirst());
            linkedList.removeFirst();
            temp++;
        }
        return linkedList;
    }
}