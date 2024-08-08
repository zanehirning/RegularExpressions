package org.example.floats

class FirstDigit : FloatState {
    override fun consumeCharacter(char: String, floatVerifier: FloatVerifier) {
        if (char == "0") {
            floatVerifier.state = Zero()
        }
        else if (char in "123456789") {
            floatVerifier.state = Integer()
        }
        else if (char == ".") {
            floatVerifier.state = Period()
        }
        else {
            floatVerifier.state = InvalidFloat()
        }
    }
}