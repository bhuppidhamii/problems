public class maxWater {

  public static void main(String args[]) {
    int arr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
    int l = arr.length;
    int currWaterArea = 0;
    int waterArea = 0;
    int s = 0, e = 0;
    for (int i = 0; i < l; i++) {
      for (int j = i + 1; j < l; j++) {
        // currWaterArea=height x width
        currWaterArea =
          Math.max(currWaterArea, Math.min(arr[i], arr[j]) * (j - i));
        if (currWaterArea > waterArea) {
          s = i;
          e = j;
          waterArea = currWaterArea;
        }
      }
    }
    System.out.print(waterArea + " from " + s + " " + e);
  }
}
