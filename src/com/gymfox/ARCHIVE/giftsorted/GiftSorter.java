package com.gymfox.ARCHIVE.giftsorted;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class GiftSorter {
    public String sortGiftCode(String code){
        char[] newCode = code.toCharArray();

        Arrays.sort(newCode);

        return new String(newCode);
    }

    @Test
    public void Tests1() throws Exception {
        GiftSorter gs = new GiftSorter();
        assertEquals("sort fedcba", "abcdef", gs.sortGiftCode("fedcba"));
    }

    @Test
    public void Tests2() throws Exception {
        GiftSorter gs = new GiftSorter();
        assertEquals("reverse alphabet", "abcdefghijklmnopqrstuvwxyz", gs.sortGiftCode("zyxwvutsrqponmlkjihgfedcba"));
    }
}
