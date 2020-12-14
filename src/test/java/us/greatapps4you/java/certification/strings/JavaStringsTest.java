/*
 * GreatApps4you LLC Copyright (c) 2020
 * https://greatapps4you.us
 * CSSML NDSMD VRS + NSMV SMQL IVB
 */

package us.greatapps4you.java.certification.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JavaStringsTest {

    private JavaStrings javaStrings;

    @BeforeEach
    void setUp() {
        javaStrings = new JavaStrings();
    }

    @Test
    void whenStaticString_ThenSameObject() {
        String given = "given";
        String given2 = "given";
        javaStrings.storeValue(given);
        String actual = javaStrings.getValue();
        Assertions.assertTrue(actual == given);
        Assertions.assertTrue(actual == given2);
        Assertions.assertTrue(given == given2);
    }

    @Test
    void whenNewOperator_ThenNewObject() {
        String given = "given";
        String given2 = new String("given");
        javaStrings.storeValue(given);
        String actual = javaStrings.getValue();
        Assertions.assertTrue(actual == given);
        Assertions.assertFalse(given == given2);
        Assertions.assertFalse(actual == given2);
    }

}