import java.util.Arrays;

public class InsertionSort {
    static void insertionSrot(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j-1]>arr[j]){
                    arr[j] = arr[j]+arr[j-1];
                    arr[j-1] = arr[j]-arr[j-1];
                    arr[j] = arr[j]-arr[j-1];
                }else{
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,3,4,1,2};
        insertionSrot(arr);
        System.out.println("Sorted array is : "+Arrays.toString(arr));
    }
}
