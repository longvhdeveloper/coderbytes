package com.company.algorithm;

class Node {
  private String data;
  private Node next;

  public Node(String data, Node next) {
    this.data = data;
    this.next = next;
  }

  public Node(String data) {
    this.data = data;
    this.next = null;
  }

  public String getData() {
    return data;
  }

  public Node getNext() {
    return next;
  }
}


public class LinkedListMiddleElement {
  public static void main(String[] args) {
    Node node5 = new Node("Hello");
    Node node4 = new Node("21", node5);
    Node node3 = new Node("Green", node4);
    Node node2 = new Node("Blue", node3);
    Node node1 = new Node("Jackie", node2);

    Node middle = findMiddleElementFaster(node1);

    System.out.println(middle.getData());
  }

  /**
   * Find middle element of linked list by native
   */
  public static Node findMiddleElement(Node head) {
    Node node = head;
    int length = 0;
    while (node != null) {
      length++;
      node = node.getNext();
    }

    int middle = length / 2;
    int counter = 0;
    node = head;
    while (counter < middle) {
      counter++;
      node = node.getNext();
    }

    return node;
  }

  public static Node findMiddleElementFaster(Node head) {
    Node slower = head;
    Node faster = head;

    while (faster.getNext() != null && slower != null) {
      faster = faster.getNext().getNext();
      slower = slower.getNext();
    }
    return slower;
  }
}
