package JavaHw4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

import static JavaHw4.Task1.randomList;

/*
Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
 */
public class Task3 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (Integer temp : randomList(10)) {
            linkedList.add(temp);
        }
        System.out.print("LinkedList ");
        Iterator itr = linkedList.iterator();
        int sum = 0;
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
            sum = sum + (Integer) element;
        }
        System.out.println("");
        System.out.println("Sum of LinkedList " + sum);
        System.out.println("Final LinkedList " + linkedList);
    }
}
