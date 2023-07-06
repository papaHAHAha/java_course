package seminar4;

import java.util.LinkedList;
import java.util.Scanner;

public class zadanie2 {
  /*
   * Принимает от пользователя строку вида
   * text~num
   * Нужно рассплитить строку по ~, сохранить text в связный список на позицию
   * num.
   * Если введено print~num, выводит строку из позиции num в связном списке и
   * удаляет её из списка.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean work = true;
    LinkedList<String> list = new LinkedList<>();
    while (work) {
      String line = scanner.nextLine();
      String[] arr = line.split("~");
      String text = arr[0];
      String numString = arr[1];
      int num = Integer.parseInt(numString);
      if (num > list.size() || num < 0) {
        System.out.println("index out of bounds");
        continue;
      }
      switch (text) {
        case "print":
          if (num == list.size()){
            System.out.println("index out of bounds");
            continue;
          }
          System.out.println(list.remove(num));
          break;
        case "end":
          work = false;
          break;
        default:
          list.add(num, text);
      }
    }
  }
}
