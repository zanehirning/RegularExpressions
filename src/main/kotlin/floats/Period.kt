package org.example.floats

class Period : FloatState {
    override fun consumeCharacter(char: String, floatVerifier: FloatVerifier) {
        floatVerifier.state = if (char in "0123456789") ValidFloat() else InvalidFloat()
    }
}