package com.gymfox.education.codewars.tenMinWalk;

import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        int isZero = 0;

        for ( int i = 0; i < walk.length; i++ ) {

            if ( walk[i] == 'n' ) {
                isZero += 1;
            }
            if ( walk[i] == 's' ) {
                isZero -= 1;
            }
            if ( walk[i] == 'w' ) {
                isZero += 1;
            }
            if ( walk[i] == 'e' ) {
                isZero -= 1;
            }
        }

        if ( walk.length == 10 && isZero == 0 ) {
            return true;
        }

        return false;
    }
}

 class ExampleTest {
    @Test
    public void Test() {
        assertEquals("Should return true", true, TenMinWalk.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
        assertEquals("Should return false", false, TenMinWalk.isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
        assertEquals("Should return false", false, TenMinWalk.isValid(new char[] {'w'}));
        assertEquals("Should return false", false, TenMinWalk.isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));
    }
}
