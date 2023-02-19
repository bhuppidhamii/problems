public class stringSubset {

  public static void findSubsets(String str, String ans, int i) {
    // base case
    if(i==str.length()){
        System.out.print(ans+", ");
        return;
    }
    // kaam- recursion

    // yes
    findSubsets(str, ans + str.charAt(i), i+1);
    //no
    findSubsets(str, ans, i+1);
  }

  public static void main(String args[]) {
    String str = "abc";
    String ans = "";
    findSubsets(str, ans, 0);
  }
}
