class LinearInt {
  static int LinSearch(int arr[], int target) {
    if (arr.length == 0) {
      return -1;
    } else {
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
          return i;
        }
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    int arr[] = { 10, 20, 30, 45, -10, -20, -13, 50, 60, -70 };
    int target = -10;
    int result = LinSearch(arr, target);
    if(result==-1){
      System.out.println("Some Error");
    }else{
      System.out.println("The index is : "+result);

    }
  }
}
