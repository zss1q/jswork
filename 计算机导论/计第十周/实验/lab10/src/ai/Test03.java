/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai;

/**
 *
 * @author dell
 */
public class Test03 {
    public static void main(String[] args){
        int a[]={7,2,5,3,1};
        int m;
        for(int j=0;j<4;j++){
        for(int i=0;i<4;i++){
        if(a[i]>a[i+1]){
            m=a[i];
            a[i]=a[i+1];
            a[i+1]=m;
        }
    }}
    for(int i=0;i<5;i++){
    System.out.print(a[i]+" ");
}
}
}
