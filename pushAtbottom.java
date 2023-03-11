import java.util.*;

public class pushB {

  public static void pushBottom(Stack<Integer> s, int data) {
    //base case
    if (s.isEmpty()) {
      s.push(data);
      return;
    }
    //kaam
    int top = s.pop();
    pushBottom(s, data);
    s.push(top);
  }

  public static void main(String args[]) {
    Stack<Integer> s = new Stack<>();

    s.push(1);
    s.push(2);
    s.push(3);

    System.out.println(s);
    pushBottom(s, 4);
    System.out.println(s);
    // [1, 2, 3]     
    // [4, 1, 2, 3]

  }
}
