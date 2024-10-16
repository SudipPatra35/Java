import java.util.*;

public class OccurenceOfElement {

  public static void main(String[] args) {
    int arr[] = { 1,1,1,2,2,2,3,3,3};
    boolean flag = true;
    int count = 0;
    List<Integer> arr2 = new ArrayList<>();
    List<Integer> arr3 = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
      if (arr2.contains(arr[i]) == false) {
        arr2.add(arr[i]);
      }
    }
    for (int j = 0; j < arr2.size(); j++) {
      count = 0;
      for (int k = 0; k < arr.length; k++) {
        if (arr2.get(j) == arr[k]) {
          count += 1;
        }
      }
      if (arr3.contains(count) == false) {
        arr3.add(count);
      }else{
        flag = false;
        break;
      }
    }

    if (flag == true) {
    System.out.println("Unique Occurence are : " + arr3);
    }else{
      System.out.println("No unique Occurence in the array");
    }
  }
}
