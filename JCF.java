import java.util.LinkedList;

public class JCF {

  public static void main(String args[]) {
    //create LinkedList----------
    LinkedList<Integer> ll = new LinkedList<>();
    //add--------------
    ll.addLast(1);
    ll.addLast(2);
    ll.addFirst(0);
    ll.addFirst(-1);
    System.out.println(ll);
    // [-1, 0, 1, 2]

    //remove
    ll.removeFirst();
    ll.removeLast();
    System.out.println(ll);
    //[0, 1]
  }
}
