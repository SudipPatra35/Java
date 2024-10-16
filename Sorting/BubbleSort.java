import java.util.Arrays;
public class BubbleSort {
  static void bubbleSort(int arr[]) {
    boolean swapped = false;
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      for (int j = 1; j < n - i; j++) {
        if (arr[j] < arr[j - 1]) {
          arr[j] = arr[j] + arr[j - 1];
          arr[j - 1] = arr[j] - arr[j - 1];
          arr[j] = arr[j] - arr[j - 1];
          swapped = true;
        }
      }
      if (swapped == false) {
        break;
      }
    }
  }
  public static void main(String[] args) {
    int arr[] = {1,2,3,4,5};
    bubbleSort(arr);
    System.out.println("Sorted array is : " + Arrays.toString(arr));
  }
}
