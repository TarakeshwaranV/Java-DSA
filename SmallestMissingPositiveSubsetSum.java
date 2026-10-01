import java.util.*;
class SmallestMissingPositiveSubsetSum{
    public static void main(String a[]){
        int[] arr={1,1,3,4};
        int sum=1;
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<n;i++){
          if(arr[i]>sum){
            break;
          }
          sum+=arr[i];
        }
        System.out.println(sum);
    }
}