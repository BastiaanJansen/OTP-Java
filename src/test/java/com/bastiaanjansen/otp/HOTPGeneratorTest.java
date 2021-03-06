package com.bastiaanjansen.otp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HOTPGeneratorTest {

    private final byte[] secret = "vv3kox7uqj4kyakohmzpph3us4cjimh6f3zknb5c2oobq6v2kiyhm27q".getBytes();

    @Test
    void generateWithSixDigits() {
        HOTPGenerator generator = new HOTPGenerator(6, secret);
        assertEquals("560287", generator.generateCode(1));
    }

    @Test
    void generateWithSevenDigits() {
        HOTPGenerator generator = new HOTPGenerator(7, secret);
        assertEquals("1560287", generator.generateCode(1));
    }

    @Test
    void generateWithEightDigits() {
        HOTPGenerator generator = new HOTPGenerator(8, secret);
        assertEquals("61560287", generator.generateCode(1));
    }
}