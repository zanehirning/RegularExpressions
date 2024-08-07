package org.example.integer

class InvalidInteger : IntegerState {
    override fun consumeCharacter(char: String, integerVerifier: IntegerVerifier) {
        // Do nothing
    }
}