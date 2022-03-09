package com.kotlinbaseball.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class NumbersTest {

    @Test
    fun `create Numbers`() {
        val numbers = Numbers("123")

        assertThat(numbers).isEqualTo(Numbers("123"))
    }

    @Test
    fun `Numbers by length Less than 3`() {
        Assertions.assertThrows(IllegalArgumentException::class.java) {
            Numbers("12")
        }
    }
}