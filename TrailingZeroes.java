class TrailingZeroes{
    public static void main(String a[]){
        int fact=100;
        int count=0;
        while(fact>=5){
            fact=fact/5;
            count+=fact;
        }
         System.out.println(count);
    }
}