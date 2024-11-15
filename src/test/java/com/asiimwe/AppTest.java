package com.asiimwe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testGreet() {
        App app = new App();
        String result = app.greet("World");
        assertEquals("Hello, World!", result, "The greeting should be 'Hello, World!'");
    }
}
