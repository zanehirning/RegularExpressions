package org.example.floats

class Period : FloatState {
    override fun consumeCharacter(char: String, floatVerifier: FloatVerifier) {
        if (char in "0123456789") {
            floatVerifier.state = ValidFloat()
        }
        else {
            floatVerifier.state = InvalidFloat()
        }
    }
}