public class LinkedList {

  public static class Node {

    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;
  public static int size;

  // methods

  // add() first
  public void addFirst(int data) {
    //1) Create new node
    Node newNode = new Node(data);
    size++;
    if (head == null) {
      head = tail = newNode;
      return;
    }

    // 2) Newnode next = head (old)
    newNode.next = head; //link

    // 3) head= newNode
    head = newNode;
  }

  //add() last
  public void addLast(int data) {
    //1) Create new node
    Node newNode = new Node(data);
    size++;
    if (head == null) {
      head = tail = newNode;
      return;
    }

    // 2) tail next = newNode
    tail.next = newNode; //link

    // 3) tail= newNode
    tail = newNode;
  }

  // add in the middle()
  public void addInMiddle(int idx, int data) {
    if (idx == 0) {
      addFirst(data);
      return;
    }
    Node newNode = new Node(data);
    size++;
    Node temp = head;

    int i = 0;
    while (i < idx - 1) {
      temp = temp.next;
      i++;
    }

    newNode.next = temp.next;
    temp.next = newNode;
  }

  // remove()

  // print()
  public void printLL() {
    Node temp = head;

    while (temp != null) {
      System.out.print(temp.data + "->");
      temp = temp.next;
    }
    System.out.println();
  }

  // search()
  public static void main(String args[]) {
    LinkedList ll = new LinkedList();
    ll.addFirst(2);
    ll.addFirst(1);
    ll.addLast(3);
    ll.addLast(4);

    ll.addInMiddle(2, 9);

    ll.printLL();
    System.out.println("Size of node is:- " + ll.size);
  }
}
