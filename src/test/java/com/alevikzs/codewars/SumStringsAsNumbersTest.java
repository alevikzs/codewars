package com.alevikzs.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumStringsAsNumbersTest {

    @Test
    void test() {
        assertEquals("579", SumStringsAsNumbers.sumStrings("123", "456"));
        assertEquals("142", SumStringsAsNumbers.sumStrings("19", "123"));
        assertEquals("123", SumStringsAsNumbers.sumStrings("123", "0"));
        assertEquals("0", SumStringsAsNumbers.sumStrings("0", "0"));
        assertEquals("10367", SumStringsAsNumbers.sumStrings("800", "9567"));
        assertEquals("274532153759655960129564762991", SumStringsAsNumbers.sumStrings("1340148821783375423276575", "0274530813610834176754141486416"));
    }

}