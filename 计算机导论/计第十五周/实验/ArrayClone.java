/**
 * 
 */
package com.sise.test05;

import java.util.Arrays;

/**
* @ClassName: ArrayClone
* @Description: TODO
* @author 
* @date 2019年3月31日 下午4:03:12
*
*/
public class ArrayClone {

    public static void main(String[] args) {
        // The first method
        int[] arrays1 = new int[]{1, 2, 3, 4};
        int[] arrays2 = arrays1;
        System.out.println(arrays1 == arrays2);
        System.out.println(Arrays.toString(arrays1));
        System.out.println(Arrays.toString(arrays2));

        // The second method
        int[] arrays3 = new int[]{1, 2, 3, 4};
        int[] arrays4 = arrays3.clone();
        System.out.println(arrays3 == arrays4);
        System.out.println(Arrays.toString(arrays3));
        System.out.println(Arrays.toString(arrays4));

        // The third method
        int[] arrays5 = new int[]{1, 2, 3, 4};
        int[] arrays6 = Arrays.copyOf(arrays5, arrays5.length);
        System.out.println(arrays5 == arrays6);
        System.out.println(Arrays.toString(arrays5));
        System.out.println(Arrays.toString(arrays6));
    }
}