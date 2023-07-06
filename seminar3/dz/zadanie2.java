package seminar3.dz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class zadanie2 {
  /*
   * Задан целочисленный список ArrayList. Найти минимальное, максимальное и
   * среднее арифметическое из этого списка. Collections.max()
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
    int max = Collections.max(list);
    int min = Collections.min(list);
    double average = getAverage(list);
    System.out.println("max number: " + max + ", min number: " + min + ", average: " + average);
  }

  static double getAverage(List<Integer> list) {
    double sum = 0;
    for (int i : list) {
      sum += i;
    }
    return sum / list.size();
  }
}