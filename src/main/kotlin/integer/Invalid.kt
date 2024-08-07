package org.example.integer

class Invalid : IntegerState {
    override fun consumeCharacter(char: String, integerVerifier: IntegerVerifier) {
        // Do nothing
    }
}