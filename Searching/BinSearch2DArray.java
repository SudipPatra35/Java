public class BinSearch2DArray {
    static void binSearch(int arr[][],int target){
        int beg = 0;
        int end = arr[0].length-1;
        while(beg<arr.length && end>0){
            if(arr[beg][end] == target){
                System.out.println("The index is : arr["+beg+"]["+end+"]");
                return;
            } else if(arr[beg][end]<target){
                beg++;
            }else if(arr[beg][end]>target){
                end--;
            }
        }
        System.out.println("Element not found..");
    }
    public static void main(String[] args) {
        int arr[][]={{10,20,30,40},{15,25,35,45},{24,29,37,50},{34,38,39,55}};
        binSearch(arr, 30);
    }
}
