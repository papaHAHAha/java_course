package seminar4.DZ;

import java.util.LinkedList;

public class zadanie2class {
  LinkedList list = new LinkedList<>();
  int size;

  void print() {
    System.out.println(list);
  }

  LinkedList enqueue(String el) {
    list.add(el);
    return list;
  }

  void dequeue() {
    System.out.println(list.peekFirst());
    list.remove(list.peekFirst());
  }

  void first() {
    System.out.println(list.peekFirst());
  }
}
