package seminar4.DZ;

public class zadanie2 {
  /*
   * Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() -
   * помещает элемент в конец очереди, dequeue() - возвращает первый элемент из
   * очереди и удаляет его, first() - возвращает первый элемент из очереди, не
   * удаляя.
   */
  public static void main(String[] args) {
    zadanie2class list = new zadanie2class();
    list.enqueue("2");
    list.enqueue("1");
    list.enqueue("3");
    list.print();
    list.dequeue();
    list.print();
    list.enqueue("5");
    list.print();
    list.first();
    list.enqueue("0");
    list.print();
    list.dequeue();
    list.print();
    list.first();

  }
}
