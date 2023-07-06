package seminar4;

import java.util.ArrayList;
import java.util.LinkedList;

public class zadanie1 {
  /*
   * 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
   * 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
   * Сравните с предыдущим.
   */
  public static void main(String[] args) {
    ArrayList list1 = new ArrayList();
    LinkedList list2 = new LinkedList<>();
    long timeStart = System.currentTimeMillis();
    for (int i = 0; i < 10000000; i++) {
      list1.add(i);
    }
    long timeFinish = System.currentTimeMillis();
    System.out.println(timeFinish - timeStart);
  }
}
