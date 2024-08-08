package org.example.floats

interface FloatState {
    fun consumeCharacter(char: String, floatVerifier: FloatVerifier)
}