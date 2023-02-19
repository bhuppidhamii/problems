import java.lang.*;

public class maxOnes {

  public static int findMaxConsecutiveOnes(int[] nums) {
    int l = nums.length;
    int count = 0;
    int maxCount = 0;

    for (int i = 0; i < l; i++) {
      if (nums[i] == 1) {
        count++;
      } else {
        maxCount = Math.max(maxCount, count);
        count = 0;
      }
    }
    return Math.max(maxCount, count);
  }

  public static void main(String args[]) {
    int nums1[] = { 1, 1, 0, 1, 1, 1 }; //3
    int nums2[] = { 1, 0, 1, 1, 0, 1 }; //2
    int nums3[] = { 1, 1, 0, 1 }; //2
    int nums4[] = { 0 }; //0
    int nums5[] = { 0, 0 }; //0

    System.out.println(findMaxConsecutiveOnes(nums4));
  }
}
