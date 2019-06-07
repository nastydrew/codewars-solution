package com.gymfox.ARCHIVE.compareSymbols;

public class Compare {
    public static void main(String[] args) {
        String ipAsString = "127.12.45.22";
        long ipAsInt = 0;

        for (String s : ipAsString.split("\\."))
            ipAsInt = ipAsInt * 256 + Integer.parseInt(s);

        System.out.println("2131504406\n" + ipAsInt);
    }

//    public static Boolean compare(String s1, String s2) {
//        return false;
//    }
//
//    public static void main(String[] args) {
//        String str1 = "AD";
//        String str2 = "BC";
//
//        char[] chars1 = str1.toUpperCase().toCharArray();
//        char[] chars2 = str2.toUpperCase().toCharArray();
//
//        if ( chars1[0]+chars1[1] == chars2[0]+chars2[1]) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
//
//
//    }
//
//    @Test
//    public void BasicTests() {
//        assertEquals(true, Compare.compare("AD", "BC"));
//        assertEquals(false, Compare.compare("AD", "DD"));
//    }
}
