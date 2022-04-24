import java.util.*;
class Solution{
    static double area(long R){
        double are=R*R;
        return are;
    }
    static double solve(int R, int A, int B){
        double sum=0.0;
        long radius=R,count=1;
        while(radius!=0){
            sum+=area(radius);
            if(count%2==0)
                radius=radius/B;
            else
                radius=radius*A;
            count++;
        }
        sum=sum*Math.PI;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int R=sc.nextInt();
            int A=sc.nextInt();
            int B=sc.nextInt();
            
            System.out.println("Case #"+i+": "+ solve(R,A,B));
        }
    }
}