import java.util.*;
class Decimal_in_String{
    public static void main(String a[]){
     int num=50;
     int den=22;
     String res="";
     HashMap<Integer,Integer> map=new HashMap<>();
     int rem=num%den;
    res+=num/den;
     if (rem==0){
     System.out.println(res);
     return ;
     }
     res += ".";

     while(rem!=0){
        if (map.containsKey(rem)){
            int pos=map.get(rem);
            res=res.substring(0,pos)+"("+res.substring(pos)+")";
            System.out.println(res);
            return ;
        }
        map.put(rem, res.length());
        rem=rem*10;
        res+=rem/den;
        rem=rem%den;
     }
     System.out.println(res);

         }
}