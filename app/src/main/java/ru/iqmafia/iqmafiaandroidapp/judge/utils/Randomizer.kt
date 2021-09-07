package ru.iqmafia.iqmafiaandroidapp.judge.utils

import java.util.*

class Randomizer {
    fun shuffle(array: Array<String>) {
        val randomFisherYates = Random()
        for (i in array.size - 1 downTo 1) {
            val index = randomFisherYates.nextInt(i + 1)
            val a = array[index]
            array[index] = array[i]
            array[i] = a
        }
    }
}