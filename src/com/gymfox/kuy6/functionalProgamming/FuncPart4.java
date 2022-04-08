package com.gymfox.kuy6.aggregateoperation.functionalProgamming;

import java.util.HashMap;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FuncPart4 {
    public Map<Integer, String> symbols = new HashMap<Integer, String>() {{
        put((int)'a', "aRbFR");
        put((int)'b', "LFaLb");
        put((int)'F', "F");
        put((int)'L', "L");
        put((int)'R', "R");
    }};

    public IntFunction<String> mapFunction = value -> symbols.getOrDefault(value, Character.toString((char)value));
//    public IntFunction<String> mapFunction = i -> i == 'a' ? "aRbFR" : i == 'b' ? "LFaLb" : "" + (char)i;

    public static void main(String[] args) {
        FuncPart4 test = new FuncPart4();
        System.out.println(test.mapFunction.apply('r'));
    }

    //Make the function; map the chars to Strings
    //a -> aRbFR, b -> LFaLb, otherwise -> itself

    /**
     * Make the curve; stream the chars repeatedly (starting with Fa) through the mapFunction n times
     * Then remove the a and b (createFilter function is useful for that)
     */
    public String createCurve(int n) {
        //That's an IntStream with 'F' and 'a' ready to be  acted upon
        String charSequence = IntStream.rangeClosed(0, n).mapToObj(i->"Fa").reduce((prev, curr) -> prev.chars()
                .mapToObj(mapFunction).collect(Collectors.joining())).get();

        return charSequence.chars().filter(createFilter('a', false)).filter(createFilter('b', false)).mapToObj(i ->
                String.valueOf((char)i)).collect(Collectors.joining());
    }

    /**
     * How many of the specified char are in the given curve?
     * Hint: createFilter could be useful for this
     */
    public long howMany(char c, String curve) {
        return curve.chars().filter(createFilter(c, true)).count(); //Determined by die roll; guaranteed to be random
    }

    /**
     * Create a predicate to filter the specified char; keep or remove based on keep variable
     */
    public IntPredicate createFilter(char filterWhat, boolean keep) {
        return x -> keep ? filterWhat == x: filterWhat != x;
    }
}
/**
 * https://www.codewars.com/kata/java-functional-programming-part-4-row-row-row-your-boat-gently-down-the-dot-dot-dot
 * /solutions
*/
