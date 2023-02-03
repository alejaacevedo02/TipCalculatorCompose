package com.example.tipcalculatorcompose

import junit.framework.TestCase.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTests {
    @Test
    fun calculate_20_percent_tip_no_roundup() {
      val calculatedTip = calculateTip(amount = 10.0 , tipPercent = 20.0, roundUp = false)
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        assertEquals(calculatedTip, expectedTip)
    }
}
