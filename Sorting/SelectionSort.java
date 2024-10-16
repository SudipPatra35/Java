import java.util.Arrays;

public class SelectionSort{
    static void selectionSort(int arr[]){
        int maxIndex;
        for (int i=0;i<arr.length-1;i++){
            int last = arr.length-i-1;
            maxIndex = Max(arr, last);
            swap(arr, maxIndex, last);
        }
    }
    static int Max(int arr[],int end){
        int maxIndex=0;
        for(int i=0;i<end;i++){
            if(arr[i]>arr[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    static void swap(int arr[],int maxIndex, int last){
        arr[maxIndex] = arr[maxIndex] + arr[last];
        arr[last] = arr[maxIndex] - arr[last];
        arr[maxIndex] = arr[maxIndex] - arr[last];
    }
    public static void main(String[] args) {
        int arr[] = {4,5,1,2,3};
        selectionSort(arr);
        System.out.println("Sorted array is : "+ Arrays.toString(arr));
    }
}