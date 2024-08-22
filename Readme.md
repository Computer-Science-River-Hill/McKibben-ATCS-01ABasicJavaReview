# Project 1A Basic Java Review


## Preface

All of these projects will be used together as we progress through the course. While this is shown as a **Java **project, you are free to use any **approved **object-oriented  language you like with the expectation that you will use the language's test facilities and be consistent with your language choice. All gitHub repositories that Mr. McKibben creates will be Java centric, but you are free to change that. I’ll give you help on how to do that provided I know the mechanisms for the language you are choosing (Specifically, I can do so for Python and C++)


## Specifications
1. Create a class called a PatternMaker. It will have a single static method called MakePattern. Given a string containing a word, it returns a string which contains the pattern of letters in that word, with 'A' representing the first distinct letter in the word, 'B' representing the second distinct letter in the word, and 'C' representing the third, etc. This is case-insensitive, ie: A and a are the same.  For example: \
`Word                Pattern  \
----                ------- \
cat                 ABC \
moon                ABBC \
where               ABCDC \
baboon              ABACCD \
MisSisSipPi         ABCCBCCBDDB \
`
2. Create unit tests for PatternMaker. 
3. Test the driver on the five words above and five other words.  — Try to find edge cases and places where it will fail.
4. Prove to Mr. McKibben that your code works.

## Sample Output:


```
cat=====>ABC
moon=====>ABBC
where=====>ABCDC
baboon=====>ABACCD
Mississippi=====>ABCCBCCBDDB
```



## Sample PatternMaker.java


```java
package org.example;

public class PatternMaker {
    public static String MakePattern(String word) {
        //Magic goes here
        return "";
    }
}
```



## Sample PatternMakerTest.java


```java
package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatternMakerTest {

    @Test
    void testcat() {
        assertEquals("ABC",PatternMaker.MakePattern("cat"));
    }
}
```



## Sample Main.Java


```java
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
          return word + "=====>" + PatternMaker.MakePattern(word);
    }
}
```