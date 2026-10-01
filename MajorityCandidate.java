class MajorityCandidate{
    public static void main(String a[]){
        int[] arr={3,3,3,3,3,4,5};
        int maj=arr[0];
        int count=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==maj){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                maj=arr[i];
            }

        }
        count=0;
        for(int i=0;i<arr.length;i++){
         if(maj==arr[i]){
          count++;
         }
        }
        int n=arr.length;
        if(count>(n/2)){
            System.out.println(maj);
        }
        else{
            System.out.println("No maj element");
        }
    }
}