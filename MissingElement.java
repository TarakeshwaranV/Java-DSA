class MissingElement{
    public static void main(String a[]){
        int[] arr={1,2,3,4,6,7,8,9};
        int N=(arr.length)+1;
        int sum=(N*(N+1))/2;
        for(int i=0;i<(N-1);i++){
            sum-=arr[i];
        }
        System.out.println(sum);
    }
}