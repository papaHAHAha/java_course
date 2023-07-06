package seminar4;

public class zadanie5 {
  /*
   * Реализовать стэк с помощью массива.
   * Нужно реализовать методы:
   * size(), empty(), push(), peek(), pop().
   */
  public static void main(String[] args) {
    myStack stack = new myStack();
    stack.push("1");
    stack.push("2");
    System.out.println(stack.size);
    stack.push("3");
    stack.push("4");
    System.out.println(stack.size);
    System.out.println(stack.peek());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.peek());
  }
}
