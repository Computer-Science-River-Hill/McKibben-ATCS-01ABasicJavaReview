package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(testMakePattern("cat"));
        System.out.println(testMakePattern("moon"));
        System.out.println(testMakePattern("where"));
        System.out.println(testMakePattern("baboon"));
        System.out.println(testMakePattern("Mississippi"));
    }
    public static String testMakePattern(String word) {
          String temp = "";
          temp += word;
          temp += "=====>";
          temp += PatternMaker.MakePattern(word);
          return word + "=====>" + PatternMaker.MakePattern(word);
    }
}