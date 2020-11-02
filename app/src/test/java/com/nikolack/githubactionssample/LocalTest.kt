package com.nikolack.githubactionssample

import org.junit.Test

import org.junit.Assert.*

/**
 * This test will not be run with GitHub Actions
 */
class LocalTest {

    @Test
    fun shouldFail() {
        assertEquals(5, 2 + 2)
    }
}