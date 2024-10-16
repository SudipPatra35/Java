public class Min_Max2DArray {

  static int min(int arr[][]) {
    int min = arr[0][0];
    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) {
        if (arr[row][col] < min) {
          min = arr[row][col];
        }
      }
    }
    return min;
  }
  static int max(int arr[][]) {
    int max = arr[0][0];
    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) {
        if (arr[row][col] > max) {
          max = arr[row][col];
        }
      }
    }
    return max;
  }

  public static void main(String[] args) {
    int arr[][] = { { 15, 16, 17, 18 }, {10,11,12},{2,5,6},{78,45,56} };
    int min = min(arr);
    int max = max(arr);
    System.out.println("Minimum element is : "+min);
    System.out.println("Maximum element is : "+max);

  }
}
