package seminar3;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class zadanie3 {
  /*
   * Создать список типа ArrayList
   * Поместить в него как строки, так и целые числа.
   * Пройти по списку, найти и удалить целые числа.
   */
  public static void main(String[] args) {
    List list = new ArrayList<>();
    list.add(4);
    list.add("10");
    list.add("asdad");
    list.add(7);
    list.add(4.5);
    list.add(null);

    removeInt(list);
    System.out.println(list);
  }

  static void removeInt(List list) {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) instanceof Integer) {
        list.remove(i);
        i--;
      }
    }
  }

  static void removeInt2(List list){
    java.util.Iterator iterator = list.iterator();
    while (iterator.hasNext()){
      Object object = iterator.next();
      if (object instanceof Integer) {
        iterator.remove();
      }
    }
  }

}
