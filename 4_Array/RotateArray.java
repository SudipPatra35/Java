// Rotate the array clockwise by a positive integer K

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int arr []= {10,20,30,40,50,60,70,80,90};
        int k=6;
        int temp;
        for (int i=1;i<k/2;i++){
            if(k>0){
                temp = arr[i];
                arr[i]= arr[k];
                arr[k]= temp;
                k--;
            }else{
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
