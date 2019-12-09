
package Student;
 import java.util.Scanner;
public class JieCheng {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println("请输入的n:");
        n=input.nextInt();
        System.out.println(n+"的阶乘积是："+calculateN(n));}
         public static long calculateN(int n)
         { if(n==1  || n==0){   return 1; }   
    return n*calculateN(n-1);                   
    }  
}
