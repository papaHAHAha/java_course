

import java.util.List;
import java.util.Map;

public class zadanie1 {
  public static void main(String[] args) {
    PhoneBook phoneBook = new PhoneBook();

    phoneBook.addPerson("Ivanov", "111-11-1");
    phoneBook.addPerson("Ivanov", "231-22-11");
    phoneBook.addPerson("Petrov", "22-2-222");

    List ivanovPhones = phoneBook.findPerson("Ivanov");
    System.out.println("ivanov phones: " + ivanovPhones);

    List PetrovPhones = phoneBook.findPerson("Petrov");
    System.out.println("Petrov phones: "+ PetrovPhones);

    List Unknown = phoneBook.findPerson("Unknown");
    System.out.println("Unknown phones: "+ Unknown);
  }
}
