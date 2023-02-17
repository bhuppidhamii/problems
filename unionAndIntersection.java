import java.util.*;

public class problem {

  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void union(int arr1[], int arr2[]) {
    int unionArr[] = new int[arr1.length + arr2.length];
    for (int i = 0; i < arr1.length; i++) {
      unionArr[i] = arr1[i];
    }
    for (int j = 0; j < arr2.length; j++) {
      unionArr[j + arr1.length] = arr2[j];
    }
    // remove dublicates in union array.
    // printArray(unionArr);
    Arrays.sort(unionArr);
    // printArray(unionArr);

    // Counting the number of unique elements in the array
    int count = 1;
    for (int i = 1; i < unionArr.length; i++) {
      if (unionArr[i] != unionArr[i - 1]) {
        count++;
      }
    }
    // System.out.println(count);

    // Creating a new array to hold the unique elements
    int[] result = new int[count];
    result[0] = unionArr[0];
    int j = 1;
    for (int i = 1; i < unionArr.length; i++) {
      if (unionArr[i] != unionArr[i - 1]) {
        result[j] = unionArr[i];
        j++;
      }
    }

    printArray(result);
  }

  public static void intersection(int arr1[], int arr2[]) {
    StringBuilder sb = new StringBuilder("");

    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr2.length; j++) {
        if (arr1[i] == arr2[j]) {
          sb.append(arr1[i] + " ");
        }
      }
    }
    // System.out.println(sb);

    String[] inersArr = sb.toString().split(" ");
    int[] interSection = new int[inersArr.length];

    for (int i = 0; i < inersArr.length; i++) {
      interSection[i] = Integer.parseInt(inersArr[i]);
    }

    printArray(interSection);
  }

  public static void main(String args[]) {
    int arr1[] = { 1, 2, 3, 4, 5 };
    int arr2[] = { 4, 5, 6, 7, 8 };
    union(arr1, arr2);
    intersection(arr1, arr2);
  }
}
