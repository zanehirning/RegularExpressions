package org.example.floats

class Zero : FloatState {
    override fun consumeCharacter(char: String, floatVerifier: FloatVerifier) {
        if (char == ".") {
            floatVerifier.state = Period()
        }
        else {
            floatVerifier.state = InvalidFloat()
        }
    }
}