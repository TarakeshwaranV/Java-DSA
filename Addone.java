import java.util.*;
class Addone{
    public static void main(String a[]){
        int[] arr={8,9,9};
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
          if (arr[i]<9){
            arr[i]+=1;
            System.out.println(Arrays.toString(arr));
            return;
          }
          arr[i]=0;
        }
        int[] result = new int[arr.length + 1];
        result[0] = 1;

        System.out.println(Arrays.toString(result));

    }
}