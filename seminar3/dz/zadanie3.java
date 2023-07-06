package seminar3.dz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class zadanie3 {
  /*
   * Заполнить список названиями планет Солнечной системы в произвольном порядке с
   * повторениями. Вывести название каждой планеты и количество его повторений в
   * списке. Collections.frequency(list, item)
   */
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list = listAdd(list);
    System.out.println(list);
    listWrite(list);
  }

  static List<String> listAdd(List<String> list) {
    list.add("Mercury");
    list.add("Venus");
    list.add("Mars");
    list.add("Mercury");
    list.add("Saturn");
    list.add("Earth");
    list.add("Mars");
    list.add("Neptune");
    list.add("Uranus");
    list.add("Earth");
    list.add("Neptune");
    return list;
  }

  static void listWrite(List<String> list) {
    System.out.println("Mercury occurs " + Collections.frequency(list, "Mercury") + " times");
    System.out.println("Venus occurs " + Collections.frequency(list, "Venus") + " times");
    System.out.println("Mars occurs " + Collections.frequency(list, "Mars") + " times");
    System.out.println("Earth occurs " + Collections.frequency(list, "Earth") + " times");
    System.out.println("Saturn occurs " + Collections.frequency(list, "Saturn") + " times");
    System.out.println("Neptune occurs " + Collections.frequency(list, "Neptune") + " times");
    System.out.println("Uranus occurs " + Collections.frequency(list, "Uranus") + " times");
  }
}
