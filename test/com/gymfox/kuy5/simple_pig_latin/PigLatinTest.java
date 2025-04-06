package com.gymfox.kuy5.simple_pig_latin;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PigLatinTest {
    @Test
    public void FixedTests() {
        assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
        assertEquals("elloHay, Iay avehay aay ommacay!", PigLatin.pigIt("Hello, I have a comma!"));
        assertEquals("aay bay cay", PigLatin.pigIt("a b c"));
        assertEquals("ctaAay steay abulafay", PigLatin.pigIt("Acta est fabula"));
        assertEquals("arbaBay onnay acitfay hilosophumpay", PigLatin.pigIt("Barba non facit philosophum"));
        assertEquals("Oay emporatay oay oresmay !", PigLatin.pigIt("O tempora o mores !"));
        assertEquals("", PigLatin.pigIt(""));
    }
}