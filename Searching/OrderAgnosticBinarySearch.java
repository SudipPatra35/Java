public class OrderAgnosticBinarySearch {

  static void binSearch(int arr[], int target) {
    int beg = 0;
    int end = arr.length - 1;
    int mid = (beg + end) / 2;
    boolean isAsc = arr[beg] < arr[end];
    for (; beg <= end;) {
        System.out.println(mid);
      if (arr[mid] == target) {
        System.out.println("The index of " + target + " is : " + mid);
        return;
      }
      if (isAsc) {
        if (target < arr[mid]) {
          end = mid - 1;
          mid = (beg + end) / 2;
        } else {
          beg = mid + 1;
          mid = (beg + end) / 2;
        }
      } else {
        if (target > arr[mid]) {
          end = mid - 1;
          mid = (beg + end) / 2;
        } else {
          beg = mid + 1;
          mid = (beg + end) / 2;
        }
      }
    }
  }

  public static void main(String[] args) {
    int arr[] ={10,9,8,7,6,5,4,3,2,1};
    // int arr[] ={1,2,3,4,5,6,7,8,9,10};
        binSearch(arr, 2);
  }
}
