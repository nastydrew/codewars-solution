package com.gymfox.kuy7.sort_the_gift_code;

import java.util.Arrays;

public class GiftSorter {
    public String sortGiftCode(String code){
        char[] sortChar = code.toCharArray();
        Arrays.sort(sortChar);
        String result = new String(sortChar);

        return result;
    }
}
