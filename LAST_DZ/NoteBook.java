package LAST_DZ;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NoteBook {
  private String brand;
  private String model;
  private int ram;
  private int storage;
  private float price;
  private String operatingSystem;
  private String color;

  public NoteBook(String brand, String model, int ram, int storage, float price, String operatingSystem, String color) {
    this.brand = brand;
    this.model = model;
    this.ram = ram;
    this.storage = storage;
    this.price = price;
    this.operatingSystem = operatingSystem;
    this.color = color;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getRam() {
    return ram;
  }

  public void setRam(int ram) {
    this.ram = ram;
  }

  public int getStorage() {
    return storage;
  }

  public void setStorage(int storage) {
    this.storage = storage;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }

  public String getOperatingSystem() {
    return operatingSystem;
  }

  public void setOperatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void printInfo() {
    System.out.println("Brand: " + brand);
    System.out.println("Model: " + model);
    System.out.println("RAM: " + ram);
    System.out.println("Storage(gigabyte): " + storage);
    System.out.println("Price: " + price);
    System.out.println("Operating System: " + operatingSystem);
    System.out.println("Color: " + color);
    System.out.println();
  }

  public static void noteBookChoice(NoteBook[] noteBooks) {
    System.out.println("Enter filter criteria (separated by space): ");
    System.out.println("1 - RAM");
    System.out.println("2 - Price");
    System.out.println("3 - Operating System");
    System.out.println("4 - Color");

    Scanner scanner = new Scanner(System.in);
    String criteriaInput = scanner.nextLine();
    String[] criteriaArray = criteriaInput.split(" ");

    Map<String, Integer> intFilter = new HashMap<>();
    Map<String, String> stringFilter = new HashMap<>();

    for (String criteria : criteriaArray) {
      int criterion = Integer.parseInt(criteria);
      if (criterion == 1) {
        System.out.println("Enter min RAM value: ");
        int minRam = scanner.nextInt();
        intFilter.put("RAM", minRam);
      } else if (criterion == 2) {
        System.out.println("Enter min Price value: ");
        int minPrice = scanner.nextInt();
        intFilter.put("Price", minPrice);
      } else if (criterion == 3) {
        System.out.println("Enter Operating System: ");
        scanner.nextLine();
        String os = scanner.nextLine();
        stringFilter.put("Operating System", os);
      } else if (criterion == 4) {
        System.out.println("Enter Color: ");
        scanner.nextLine();
        String color = scanner.nextLine();
        stringFilter.put("Color", color);
      }
    }

    List<NoteBook> filteredNotebooks = Arrays.stream(noteBooks)
        .filter(notebook -> (intFilter.get("RAM") == null || notebook.getRam() >= intFilter.get("RAM")))
        .filter(notebook -> (intFilter.get("Price") == null || notebook.getPrice() >= intFilter.get("Price")))
        .filter(notebook -> (stringFilter.get("Operating System") == null
            || notebook.getOperatingSystem().equalsIgnoreCase(stringFilter.get("Operating System"))))
        .filter(notebook -> (stringFilter.get("Color") == null
            || notebook.getColor().equalsIgnoreCase(stringFilter.get("Color"))))
        .collect(Collectors.toList());

    if (filteredNotebooks.isEmpty()) {
      System.out.println("No notebooks match the criteria.");
    } else {
      System.out.println("Filtered notebooks: ");
      filteredNotebooks.forEach(NoteBook::printInfo);
    }
  }

  @Override
  public String toString() {
    return "NoteBook{" +
        "brand='" + brand + '\'' +
        ", model='" + model + '\'' +
        ", ram=" + ram +
        ", storage=" + storage +
        ", price=" + price +
        '}';
  }

  public static void main(String[] args) {
    NoteBook notebook1 = new NoteBook(null, null, 0, 0, 0, null, null);
    notebook1.setBrand("Lenovo");
    notebook1.setModel("len1");
    notebook1.setRam(8);
    notebook1.setStorage(512);
    notebook1.setPrice(799.99f);
    notebook1.setOperatingSystem("Windows 10");
    notebook1.setColor("Silver");

    NoteBook notebook2 = new NoteBook(null, null, 0, 0, 0, null, null);
    notebook2.setBrand("Asus");
    notebook2.setModel("as1");
    notebook2.setRam(16);
    notebook2.setStorage(1024);
    notebook2.setPrice(1299.99f);
    notebook2.setOperatingSystem("Windows 11");
    notebook2.setColor("Black");
    NoteBook[] notebooks = { notebook1, notebook2 };

    noteBookChoice(notebooks);
  }
}
