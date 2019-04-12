package com.darkmfj.darktool.extensions

import org.junit.Test

import org.junit.Assert.*

/**
 * https://github.com/googlesamples/android-testing/blob/master/unit/BasicSample/app/src/test/java/com/example/android/testing/unittesting/BasicSample/EmailValidatorTest.java
 */
class StringExtsKtTest {

    @Test
    fun convertStringOfYToBool() {
        assertEquals(true,"Y".convertStringToBool())
    }

    @Test
    fun convertStringOfyToBool() {
        assertEquals(true,"y".convertStringToBool())
    }

    @Test
    fun convertStringOfnToBool() {
        assertEquals(false,"n".convertStringToBool())
    }

    @Test
    fun convertStringOfUnknownToBool() {
        assertEquals(false,"XASDS".convertStringToBool())
    }


    @Test
    fun convertTrueToStringY() {
        assertEquals("Y", true.convertBoolToString())
    }

    @Test
    fun convertFalseToStringN() {
        assertEquals("N", false.convertBoolToString())
    }

    @Test
    fun toReadableByteCount() {
    }
}