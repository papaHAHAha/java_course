package seminar1.DZ;
import java.util.Scanner;

public class dz1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Write n: ");
    int number = 0;
    int fact = 1;
    int n = scanner.nextInt();
    System.out.println("triangle number: ");
    for (int i = 1; i < n+1; i++) {
      number = (i*(i+1)/2);
      System.out.println(number);
    }
    System.out.println("factorial: ");
    for (int i = 1; i < n+1; i++) {
    fact = fact * i;
    System.out.println(fact);
    }
    scanner.close();
  }
}
