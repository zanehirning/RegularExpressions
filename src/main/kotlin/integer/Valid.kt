package org.example.integer

class Valid : IntegerState {
    override fun consumeCharacter(char: String, integerVerifier: IntegerVerifier) {
        integerVerifier.state = if (char in "0123456789") Valid() else Invalid()
    }
}