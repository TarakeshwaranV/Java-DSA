import java.util.*;
import java.util.stream.IntStream;

class ArrayoddEven{
    public static void main(String a[]){
        int[] arr={5,2,1,6,8,9,10};
        int[] left_arr=new int[arr.length];
        int[] right_arr=new int[arr.length];
        int right_count=0;
        int left_count=0;
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if ((arr[left]%2)!=0){
                left_arr[left_count++]=arr[left];
                left++;
            }
            else{
                right_arr[right_count++]=arr[left];
                left++;
            }
            if ((arr[right]%2)!=0){
                left_arr[left_count++]=arr[right];
                right--;
            }
            else{
                right_arr[right_count++]=arr[right];
                right--;
            }
        }
left_arr = Arrays.copyOf(left_arr, left_count);
right_arr = Arrays.copyOf(right_arr, right_count);
int[] result = IntStream.concat(Arrays.stream(left_arr), Arrays.stream(right_arr)).toArray();
for(int i=0;i<result.length;i++){
    System.out.println(result[i]);
}
    }
}