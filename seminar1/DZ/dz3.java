package seminar1.DZ;
import java.util.Scanner;

public class dz3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Write first number: ");
    double a = scanner.nextDouble();
    System.out.println("Write sign(+, -, *, /): ");
    char sign = scanner.next().charAt(0);
    System.out.println("Write second number: ");
    double b = scanner.nextDouble();
    double answer = 0;
    switch (sign) {
      case '+': answer = a + b;
        break;
      case '-': answer = a - b;
      break;
      case '*': answer = a * b;
      break;
      case '/': answer = a / b;
      break;
      default: System.out.printf("Error! Enter correct operator");
        return;
    }
    System.out.print("\nThe result is given as follows:\n");
    System.out.printf(a + " " + sign + " " + b + " = " + answer);
  }
}
