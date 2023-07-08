package seminar4.DZ;

import java.util.LinkedList;
import java.util.ListIterator;

public class zadanie3 {
  /*
   * Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
   */
  public static void main(String[] args) {
    LinkedList list = new LinkedList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(5);
    ListIterator<Integer> listIterator = list.listIterator();
    int sum = 0;
    while(listIterator.hasNext()){
      sum += listIterator.next();
    }
    System.out.println(sum);
  }
}
