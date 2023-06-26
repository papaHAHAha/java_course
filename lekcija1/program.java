package lekcija1;
public class program {
  public static void main(String[] args) {
    System.out.println("kasf");
    double f = 123.1244;
    float h = 124.123f;
    char ch = '{';
    boolean s = true ^ false;
    String msg = "hi";
    int ih = 23_4142_24;
    System.out.println(ih);
    int a = 20;
    a = a-- - --a;
    System.out.println(a);
    int[] arr = new int[10];
    arr[3] = 13;
    System.out.println(arr[3]);
    int[][] arra = new int[3][5];

    for (int i = 0; i < arra.length; i++) {
      for (int j = 0; j < arra[i].length; j++) {
        System.out.printf("%d ", arra[i][j]);
      }
      System.out.println();
    }
  }
    
}
