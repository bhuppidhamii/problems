public class remappingDigits {

  public static void main(String args[]) {
    // Maximum Difference by Remapping a Digit
    int num1 = 11891;
    int num2 = 90;
    System.out.println(minMaxDifference(num1));
  }

  public static void printArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + ", ");
    }
    System.out.println();
  }

  public static int minMaxDifference(int num) {
    // convert int to array
    int num2 = num;
    int maxNumArr[] = new int[Integer.toString(num).length()];
    for (int i = maxNumArr.length - 1; i >= 0; i--) {
      maxNumArr[i] = num % 10;
      num = num / 10;
    }
    // printArr(maxNumArr);

    int minNumArr[] = new int[Integer.toString(num2).length()];
    for (int i = minNumArr.length - 1; i >= 0; i--) {
      minNumArr[i] = num2 % 10;
      num2 = num2 / 10;
    }
    // printArr(minNumArr);

    //start loop from start of the array and
    // if no is !=9 then change it to 9,
    //  if same digit is repeated many times change all it's occ to 9
    for (int i = 0; i < maxNumArr.length; i++) {
      //check if 1st digit is repeated
      if (maxNumArr[i] == 9) {
        continue;
      } else {
        int first = maxNumArr[i];
        for (int j = 0; j < maxNumArr.length; j++) {
          if (maxNumArr[j] == first) {
            maxNumArr[j] = 9;
          }
        }
        break;
      }
    }
    // printArr(maxNumArr);
    // array to integer
    int maxNum = 0;
    for (int i = 0; i < maxNumArr.length; i++) {
      maxNum = maxNum * 10 + maxNumArr[i];
    }
    // System.out.println(maxNum);
    //---------------------------------

    for (int i = 0; i < 1; i++) {
      //check if 1st digit is repeated
      int first = minNumArr[i];
      for (int j = 0; j < minNumArr.length; j++) {
        if (minNumArr[j] == first) {
          minNumArr[j] = 0;
        }
      }
    }
    // printArr(minNumArr);
    // array to integer
    int minNum = 0;
    for (int i = 0; i < minNumArr.length; i++) {
      minNum = minNum * 10 + minNumArr[i];
    }
    // System.out.print(minNum);
    return maxNum - minNum;
  }
}
