package org.example.integer

class ValidInteger : IntegerState {
    override fun consumeCharacter(char: String, integerVerifier: IntegerVerifier) {
        integerVerifier.state = if (char in "0123456789") ValidInteger() else InvalidInteger()
    }
}