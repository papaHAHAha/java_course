package seminar5;

public class zadanie1 {
  /*
   * Создать структуру для хранения Номеров паспортов и Фамилий сотрудников
   * организации.
   * 123456 Иванов
   * 321456 Васильев
   * 234561 Петрова
   * 234432 Иванов
   * 654321 Петрова
   * 345678 Иванов
   * Вывести данные по сотрудникам с фамилией Иванов.
   */
  public static void main(String[] args) {
    passports passports = new passports();
    passports.addNote("123456", "Иванов");
    passports.addNote("321456", "Васильев");
    passports.addNote("234561", "Петрова");
    passports.addNote("234432", "Иванов");
    passports.addNote("654321", "Петрова");
    passports.addNote("345678", "Иванов");

    System.out.println(passports.findByName("Иванов"));
  }
}
