public class numbers {

  public static void main(String args[]) {
    int arr[] = { 1, -2, 7, -3, -1, 16, 23 };
    int negCount = 0, posCount = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 0) {
        negCount++;
      } else {
        posCount++;
      }
    }
    System.out.println(posCount);
    int negArr[] = new int[negCount];
    int posArr[] = new int[posCount];
    int k = 0;
    int l = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 0) {
        negArr[k] = arr[i];
        k++;
      } else {
        posArr[l] = arr[i];
        l++;
      }
    }
    for(int i=0;i<negArr.length;i++){
        System.out.print(negArr[i]+" ");
    }
    System.out.println();
    for(int i=0;i<posArr.length;i++){
        System.out.print(posArr[i]+" ");
    }

    // concatenate these two arrays
  }
}
