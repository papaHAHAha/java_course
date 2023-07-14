

import java.util.List;

public class Person {
  private String name;
  private List phones;

  public Person(String name, List phones) {
    this.name = name;
    this.phones = phones;
  }

  public String getName() {
    return name;
  }

  public List getPhones() {
    return phones;
  }

  public void addPhone(String phone) {
    phones.add(phone);
  }
}
