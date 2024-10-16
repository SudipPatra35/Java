import java.util.Arrays;

public class QuickSort {

  //   public static void swap(int arr[], int i, int j) {
  //     arr[i] = arr[i] + arr[j];
  //     arr[j] = arr[i] - arr[j];
  //     arr[i] = arr[i] - arr[j];
  //   }

  public static int partition(int arr[], int s, int e) {
    int pivot = arr[s];
    int count = 0;
    for (int i = s + 1; i <= e; i++) {
      if (arr[i] <= pivot) {
        count++;
      }
    }
    // Place pivot at its right place :
    int pivotIndex = s + count;
    // swap(arr,pivotIndex,s);
    int temp = pivot;
    arr[s] = arr[pivotIndex];
    arr[pivotIndex] = temp;

    //left and right wala part samal lete hain
    int i = s, j = e;
    while (i < pivotIndex && j > pivotIndex) {
      while (arr[i] <= pivot) { //Do nothing {
        i++;
      }
      while (arr[j] > pivot) { // Do nothing {
        j--;
      }
      if (i < pivotIndex && j > pivotIndex) {
        // swap(arr,i,j);
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
      }
    }
    return pivotIndex;
  }

  public static void quickSort(int arr[], int s, int e) {
    //base case
    if (s >= e) {
      return;
    }
    // Partition karenge
    int p = partition(arr, s, e);

    // left part sort koro
    quickSort(arr, s, p - 1);

    // right part sort karo :
    quickSort(arr, p + 1, e);
  }

  public static void main(String[] args) {
    int arr[] = { 10, 80, 30, 90, 40, 50, 70 };
    quickSort(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr));
  }
}
