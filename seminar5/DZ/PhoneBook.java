

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
  private Map phonebook;

  public PhoneBook() {
    phonebook = new HashMap<>();
  }
  public void addPerson(String name, String phone){
    if (!phonebook.containsKey(name)) {
      phonebook.put(name, new Person(name, new ArrayList<>()));
    }
    ((Person) phonebook.get(name)).addPhone(phone);
  }
  public List findPerson(String name){
    if (phonebook.containsKey(name)) {
      return ((Person) phonebook.get(name)).getPhones();
    }
    return null;
  }
}
