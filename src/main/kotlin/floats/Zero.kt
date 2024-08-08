package org.example.floats

class Zero : FloatState {
    override fun consumeCharacter(char: String, floatVerifier: FloatVerifier) {
        floatVerifier.state = if (char == ".") Period() else InvalidFloat()
    }
}