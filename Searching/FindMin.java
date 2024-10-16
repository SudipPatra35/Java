public class FindMin {
    static int min (int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[]={12,2,3,4,5,1,7,8,9,10};
        int min = min(arr);
        System.out.println("Minimum element is : "+min);
    }
}
