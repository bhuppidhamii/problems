public class duplicateZeros {

  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println(" ");
  }

  public static void duplicateZerosFunction(int arr[]) {
    int nums[] = new int[arr.length];
    int i = 0;
    int j = 0;
    while (j < nums.length && i < arr.length) {
      if (arr[i] == 0) {
        nums[j] = 0;
        if (j + 1 < nums.length) {
          nums[j + 1] = 0;
        }
        j += 2;
        i++;
      } else {
        nums[j] = arr[i];
        j++;
        i++;
      }
    }
    for (int k = 0; k < nums.length; k++) {
      arr[k] = nums[k];
    }
  }

  public static void main(String args[]) {
    int arr1[] = { 1, 0, 2, 3, 0, 4, 5, 0 };
    printArray(arr1);
    duplicateZerosFunction(arr1);
    printArray(arr1);

  }
}
