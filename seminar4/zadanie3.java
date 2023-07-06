package seminar4;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class zadanie3 {
  /*
   * Принимает от пользователя и “запоминает” строки.
   * Если введено print, выводит строки так, чтобы последняя введенная была первой
   * в списке, а первая - последней.
   * Если введено revert, удаляет предыдущую введенную строку из памяти.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    LinkedList list = new LinkedList<>();
    boolean work = true;
    while (work) {
      String line = scanner.nextLine();
      if (line.equalsIgnoreCase("print")) {
        ListIterator<String> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
          System.out.println(listIterator.previous());
        }
        System.out.println(list);
      } else if (line.equalsIgnoreCase("revert")) {
        list.removeLast();
        System.out.println(list);
      } else {
        list.add(line);
        System.out.println(list);
      }
    }
  }
}
