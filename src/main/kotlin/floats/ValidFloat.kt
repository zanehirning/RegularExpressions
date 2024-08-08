package org.example.floats

class ValidFloat : FloatState {
    override fun consumeCharacter(char: String, floatVerifier: FloatVerifier) {
        if (char !in "0123456789") {
            floatVerifier.state = InvalidFloat()
        }
    }
}