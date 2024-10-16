import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        Random rand = new Random();
        int arr[]= {1,2,3,4,5,6,7,8,9};
        int arr1[]=new int[3];
        int arr2[]=new int[3];
        int arr3[]=new int[3];
        for (int i=0;i<3;i++){
            if(i==0){
                arr1[0]=arr[i];
                arr1[1]=arr[rand.nextInt(9)];
                arr1[2]=arr[arr.length-1-i];
            }if(i==1){
                arr2[0]=arr[i];
                arr2[1]=arr[rand.nextInt(9)];
                arr2[2]=arr[arr.length-1-i];
            }if(i==2){
                arr3[0]=arr[i];
                arr3[1]=arr[rand.nextInt(9)];
                arr3[2]=arr[arr.length-1-i];
            }
        }

        for (int i=0;i<3;i++){
            System.out.print("Array "+i+ " is : [ ");
            for(int j=0;j<3;j++){
                if(i==0){
                   System.out.print(arr1[j]+" ");
                }if(i==1){
                    System.out.print(arr2[j]+" ");
                }if(i==2){
                    System.out.print(arr3[j]+" ");
                }
            }
            System.out.println("]");
          }
        }
    }

