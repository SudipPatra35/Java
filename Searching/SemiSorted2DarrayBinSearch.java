public class SemiSorted2DarrayBinSearch {

  static int inRowSearch(int arr[][],int row,int end, int target) {
    int beg =0;
    int mid=(beg+end)/2;
      while (beg <= end) {
        if (arr[row][mid] == target) {
        
          return mid;
        } else if (target < arr[row][mid]) {
          end = mid - 1;
          mid = (beg + end) / 2;
        } else if (target > arr[row][mid]) {
          beg = mid + 1;
          mid = (beg + end) / 2;
        }
    }
    return -1;
  }
  static void binSearch(int arr[][],int target){
    for(int row=0;row<arr.length;row++){
        int res = inRowSearch(arr, row, arr[row].length-1, target);
        if(res<0){
            continue;
        }else{
            System.out.println("The index of " + target + " is : arr[" +row+"]["+res+"]");
            return;
        }
    }
    System.out.println("Target not found...");
  }


  public static void main(String[] args) {
    int arr[][] = {
      { 1, 2, 3, 4 },
      { 5, 6, 7, 8 },
      { 9, 10, 11, 12 },
      { 13, 14, 15, 16 },
    };
    binSearch(arr,0);
  }
}
