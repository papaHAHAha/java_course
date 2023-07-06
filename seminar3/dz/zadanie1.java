package seminar3.dz;

import java.util.ArrayList;
import java.util.List;

public class zadanie1 {
  /*
   * Пусть дан произвольный список целых чисел, удалить из него четные числа
   */
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(23);
    list.add(20);
    list.add(34);
    list.add(5);
    list.add(123);
    list.add(3);
    list.add(2);
    list.add(6);
    System.out.println(list);
    list.removeIf(n -> n % 2 == 0);
    System.out.println("list without even numbers " + list);
  }
}
