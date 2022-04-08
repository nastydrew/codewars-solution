package com.gymfox.kuy7.ones_and_zeros;

import java.util.List;

public class Solution {
/**     My practice     **/
//    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
//        int result = 0;
//
//        for ( int i = binary.size() - 1, j = 0; i >= 0 && j < binary.size(); i--, j++ ) {
//            if ( binary.get(j) == 1 ) {
//                result += Math.pow(2, i);
//            }
//        }
//
//        return result;
//    }
/**     Best practise    **/

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        return binary.stream().reduce((x, y) -> x * 2 + y).get();
    }

}
