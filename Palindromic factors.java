import java.util.*;
class Solution{
    static boolean isPalin(long A){
        if(A<10)
            return true;
        String str=String.valueOf(A);
        int n=str.length();
        int i=0,j=n-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    static long solve(long A){
        long sum=0;
        for (int i=1; i<=Math.sqrt(A); i++){
                if (A%i==0){
                    boolean res=isPalin(i);
                    if (A/i == i && res)
                        sum++;
                    else{
                        if(res)
                            sum++;
                        if(isPalin(A/i))
                            sum++;
                    } 
                }
        }
        return sum;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            long A=sc.nextLong();
            System.out.println("Case #"+i+": "+ solve(A));
        }
    }
}