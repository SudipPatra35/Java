import java.util.ArrayList;

public class PowerSet {
    static void powerset(int arr[],ArrayList<Integer> output,int index,ArrayList<ArrayList<Integer>> newArr){
        if(arr.length==index){
            newArr.add(new ArrayList<>(output));
            return;
        }
        //For exclude
        powerset(arr,output, index+1, newArr);
        //For include 
        int currEle = arr[index];
        output.add(currEle);
        powerset(arr,output, index+1, newArr);
        output.remove(output.size()-1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        ArrayList <Integer> output = new ArrayList<>();
        ArrayList<ArrayList<Integer>> newArr = new ArrayList<>();
        powerset(arr,output, 0, newArr); 
        System.out.println(newArr.toString());
    }
}
