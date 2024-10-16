public class BinSearch {
    static void binSearch(int arr[],int target){
            int beg = 0;
            int end = arr.length-1;
            int mid = (beg+end)/2;
            for(;beg<=end;){
                if(arr[mid]==target){
                    System.out.println("The index of "+target+" is : "+mid);
                    return;
                }else if(target<arr[mid]){
                    end = mid-1;
                    mid=(beg+end)/2;
                }else if(target>arr[mid]){
                    beg=mid+1;
                    mid=(beg+end)/2;
                }
            }
        }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,8,9,10};
        binSearch(arr, 9);
    }
}
