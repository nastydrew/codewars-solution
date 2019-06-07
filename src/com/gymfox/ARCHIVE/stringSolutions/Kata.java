package com.gymfox.education.codewars.stringSolutions;

public class Kata {
    public Kata() {}

    public static boolean solution(String str, String ending) {
        return str.endsWith(ending) ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(solution("sumo", "sumo"));
        System.out.println(solution("abc", "abc"));
        System.out.println(solution("samurai", "ai"));
    }
}
//return str.endsWith(ending) ? true : false;