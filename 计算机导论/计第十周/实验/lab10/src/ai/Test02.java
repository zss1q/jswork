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
public class Test02 {
    public static void main(String[] args){
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.println(j+"*"+i+"="+i*j+" ");
            }
            System.out.println();
        }
    }
    
}
