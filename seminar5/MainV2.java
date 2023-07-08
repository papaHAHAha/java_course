package seminar5;

import java.util.HashMap;
import java.util.Map;

public class MainV2 {
  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();
    addNote(map, "321456", "Васильев");
    addNote(map, "234561", "Петрова");
    addNote(map, "234432", "Иванов");
    addNote(map, "654321", "Петрова");
    addNote(map, "345678", "Иванов");
    addNote(map, "123456", "Иванов");

    System.out.println(findByName(map, "Иванов"));
  }
  static void addNote(Map<String, String> map, String num, String name){
    map.put(num, name);
  }

  static String findByName(Map<String, String> map, String lastName){
    StringBuilder stringBuilder = new StringBuilder();
    for (Map.Entry<String, String> entry: map.entrySet()) {
      String num = entry.getKey();
      String name = entry.getValue();
      if (name.equalsIgnoreCase(lastName)){
        stringBuilder.append(num);
        stringBuilder.append(": ");
        stringBuilder.append(name);
        stringBuilder.append("\n");
      }
    }
    return stringBuilder.toString();
  }
}
