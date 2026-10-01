class leftrotateArray{
    public static void main(String a[]){
        int[] arr={1, 2, 3, 4, 5, 6, 7};
        int n=arr.length;
        int k=2;
        k=k%n;
        int[] temp=new int[n];
        for(int i=0;i<n;i++){
            temp[(i-k+n)%n]=arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.println(temp[i]);
        }

    }
}