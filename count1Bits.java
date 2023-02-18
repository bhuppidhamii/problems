public class count1Bits {

    public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            if((n&1)==1){
                count++;
            }
            n=n>>>1;
        }
        return count;
    }
}
  public static void main(String args[]) {
    int bitMask = 1;
    int n = 10;
    if ((n & bitMask) == 0) {
      System.out.println("even");
    } else {
      System.out.println("odd");
    }
  }
}
