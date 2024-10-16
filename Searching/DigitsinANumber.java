public class DigitsinANumber {
    // static int digits(int num){
    //     return (int)Math.log10(num)+1;
    // }
    static int even(int nums[]){
        int count = 0;
        for(int i : nums){
            if(((int)Math.log10(i) + 1) % 2 == 0){
                count++;
            }
        }
        return count;
    }
    // public int findNumbers(int[] nums) {
    //     int evenCount = 0;
        
    //     for (int i = 0; i < nums.length; i++){
    //         if(((int)Math.log10(nums[i]) + 1) % 2 == 0){
    //             evenCount++;
    //         }
    //     }
        
    //     return evenCount++;
    // }
    public static void main(String[] args) {
        int num []= {12,345,2,6,7896};
        System.out.println(even(num));
        
    }
}
