package seminar3;

import java.util.ArrayList;
import java.util.List;

public class zadanie4 {
  /*
   * Каталог товаров книжного магазина сохранен в виде двумерного списка
   * List<ArrayList<String>> так, что на 0й позиции каждого внутреннего списка
   * содержится название жанра, а на остальных позициях - названия книг. Напишите
   * метод для заполнения данной структуры.
   */
  static List<List<String>> shopbook = new ArrayList<>();
  public static void main(String[] args) {
    addBook("cказки", "колобок");
    addBook("фантастика", "гарри поттер");
    addBook("cказки", "курочка ряба");
    addBook("роман", "ромео и джульетта");
    addBook("роман", "война и мир");
    addBook("cказки", "колобок");
    addBook("cказки", "золотой петушок");

    System.out.println(shopbook);
  }

  static void addBook(String genreBook, String name) {
    for (int i = 0; i < shopbook.size(); i++) {
      List<String> genreList = shopbook.get(i);
      String genre = genreList.get(0);
      if (genreBook.equalsIgnoreCase(genre)) {
        if (!genreList.contains(name)) {
        genreList.add(name);
        }
        return;
      }
    }

    List<String> list = new ArrayList<>();
    list.add(genreBook);
    list.add(name);
    shopbook.add(list);
  }
}
