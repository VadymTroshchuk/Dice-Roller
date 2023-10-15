package com.example.diceroller

import org.junit.Test

import org.junit.Assert.*

class ExampleUnitTest {

    @Test
    fun testNumbers(){
    val dice = Dice(6)
    val diceResult = dice.roll()

        assertTrue("The expected value should be between 1 and 6" ,
            diceResult in 1..6)
    }
}