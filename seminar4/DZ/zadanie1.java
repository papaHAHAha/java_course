package seminar4.DZ;

import java.util.LinkedList;
import java.util.ListIterator;

public class zadanie1 {
  /*
   * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который
   * вернет “перевернутый” список. Постараться не обращаться к листу по индексам.
   */
  public static void main(String[] args) {
    LinkedList list = new LinkedList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(7);
    list.add(8);
    LinkedList reversedList = new LinkedList<>();
      ListIterator<Integer> listIterator = list.listIterator(list.size());
      while (listIterator.hasPrevious()){
        reversedList.add(listIterator.previous());
    }
    System.out.println(list);
    System.out.println();
    System.out.println(reversedList);
  }
}
