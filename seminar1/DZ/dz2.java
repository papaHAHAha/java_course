package seminar1.DZ;


public class dz2 {
  public static void main(String[] args) { 
    printPrime(1000);
  }
  static boolean primenumber(int num) {
    for (int i = 2; i < num; i++) {
      if (num % i == 0) return false;
    }
    return num != 1;
  }
  static void printPrime(int prime) {
    for (int i = 2; i < prime; i++) {
      if (primenumber(i))
      System.out.println(i);
    }
  }
}
