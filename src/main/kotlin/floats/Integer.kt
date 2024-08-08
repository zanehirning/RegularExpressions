package org.example.floats

class Integer : FloatState {
    override fun consumeCharacter(char: String, floatVerifier: FloatVerifier) {
        if (char in "0123456789") {
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