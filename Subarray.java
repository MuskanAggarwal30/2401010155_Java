//print all subrarrays of an array
import java.util.Arrays;
public class Subarray{
    public static void main(String[] args){
        int AbhiTakMaximum=Integer.
        int[] arr=[1,2,3,4,5,6];
        for (int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                System.out.print("cut is from"+i+" "+j+"[");
                for (int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.print(" ] ");
                System.out.println();
            }
        }
    }
}
class Solution{
    public int majority
}