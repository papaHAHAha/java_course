import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class zadanie2 {
  public static <T> void main(String[] args) {
    String s = "Иван Иванов," +
        "Светлана Петрова," +
        "Кристина Белова," +
        "Анна Мусина," +
        "Анна Крутова," +
        "Иван Юрин," +
        "Петр Лыков," +
        "Павел Чернов," +
        "Петр Лыков," +
        "Мария Федорова," +
        "Марина Светлова," +
        "Мария Савина, " +
        "Мария Рыкова," +
        "Марина Лугова," +
        "Анна Владимирова," +
        "Иван Мечников," +
        "Петр Петин," +
        "Иван Ежов";
    String[] employes = s.split(",");
    Map<String, Integer> map = new HashMap<>();
    for (String employee : employes) {
      if (map.containsKey(employee)) {
        map.put(employee, map.get(employee)+1);
      } else {
        map.put(employee, 1);
      }
    }
Map<String, Integer> sortMap = new TreeMap<>(new Comparator<>() {
      @Override
      public int compare(String o1, String o2) {
        return o2.compareTo(o1);
      }
    });
    sortMap.putAll(map);

    printMap(sortMap);
  }

  Map<String, Integer> sortMap = new TreeMap<>(new Comparator<>() {
      @Override
      public int compare(String o1, String o2) {
        return o2.compareTo(o1);
      }
    });
    
    

  public static void printMap(Map<String, Integer> sortMap2) {
    for (Map.Entry entry : sortMap2.entrySet()) {
      System.out.println("count: " + entry.getValue()
          + " employee " + entry.getKey());
    }
  }
}
