package JavaHw4;
import static JavaHw4.Task1.randomList;

import java.util.LinkedList;

/*
Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
 */
public class Task2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (Integer temp : randomList(10)) {
            linkedList.add(temp);
        }
        System.out.println("Original LinkedList = " + linkedList);
        int num = 13;
        enqueue(linkedList, num);
        System.out.println("Encueue added LinkedList = " + linkedList);
        System.out.println("Dequeue num = " + dequeue(linkedList));
        System.out.println("Decueue removed LinkedList = " + linkedList);
        System.out.println("First num of LinkedList = " + first(linkedList));
        System.out.println("Final LinkedList = " + linkedList);
    }

    public static void enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        list.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        return num;
    }

}
