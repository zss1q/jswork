package ai;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args){
        Scanner zifu=new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int num1=zifu.nextInt();
        System.out.println("请输入第二个数字");
        int num2=zifu.nextInt();
        for(int num=num1;num<=num2;num++){
        for(int i=2;i<(num/2);i++){
            if(num%i==0){
               // System.out.println("你输入的数据不是素数");
                break;
            }else{
                if(i==num/2)
                System.out.println("素数是:"+num+": ");
            }
        }
        }
    }
}
        
        