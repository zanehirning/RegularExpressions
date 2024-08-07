package org.example.integer

class FirstInteger : IntegerState {
    override fun consumeCharacter(char: String, integerVerifier: IntegerVerifier) {
        integerVerifier.state = if (char in "123456789") ValidInteger() else InvalidInteger()
    }
}