package com.gymfox.ARCHIVE.removebang;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RemoveBang {
    public static String removeBang(String str) {
        System.out.println("prog\blang.su --> \\b - возврат на один шаг назад");
        return str.replaceAll("\\b!+", "");
    }

    @Test
    public void testBasic() {
        assertEquals("nothing to do", RemoveBang.removeBang("nothing to do"));
        assertEquals("No seriously Seriously Wow", RemoveBang.removeBang("No " + "seriously! Seriously!! Wow"));
        assertEquals("!!No seriously !Seriously !!Wow", RemoveBang.removeBang("!!No! seriously! !Seriously!! !!Wow!"));
    }
}
