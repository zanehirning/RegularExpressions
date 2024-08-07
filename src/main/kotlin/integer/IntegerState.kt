package org.example.integer

interface IntegerState {
    fun consumeCharacter(char: String, integerVerifier: IntegerVerifier)
}