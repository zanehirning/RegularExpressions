package org.example.binary

interface BinaryState {
    fun consumeCharacter(char: String, binaryVerifier: BinaryVerifier)
}