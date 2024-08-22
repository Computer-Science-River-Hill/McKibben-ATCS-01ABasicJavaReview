package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatternMakerTest {

    @Test
    void testcat() {
        assertEquals("ABC",PatternMaker.MakePattern("cat"));
    }
}