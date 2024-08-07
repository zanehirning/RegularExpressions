package org.example.integer

class FirstDigit : IntegerState {
    override fun consumeCharacter(char: String, integerVerifier: IntegerVerifier) {
        integerVerifier.state = if (char in "123456789") Valid() else Invalid()
    }
}