import java.util.*;

public class intro {

  //ArrayList
  static class Stack {

    static ArrayList<Integer> list = new ArrayList<>();

    //isEmpty
    public static boolean isEmpty() {
      return list.size() == 0;
    }

    //push-------0(1)
    public static void push(int data) {
      list.add(data);
    }

    //pop--------0(1)
    public static int pop() {
      if (isEmpty()) {
        return -1;
      }
      int top = list.get(list.size() - 1);
      list.remove(list.size() - 1);
      return top;
    }

    //peek---------0(1)
    public static int peek() {
      if (isEmpty()) {
        return -1;
      }
      int top = list.get(list.size() - 1);
      return top;
    }
  }

  public static void main(String args[]) {
    Stack s = new Stack();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);

    while (s.isEmpty() != true) { //while(!s.isEmpty())
      System.out.println(s.peek()); //peek top element
      s.pop();
    }
  }
}
