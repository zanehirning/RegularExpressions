package org.example.floats

class FloatVerifier {
    lateinit var state: FloatState
    fun verify(input: String): Boolean {
        state = FirstDigit()
        input.chunked(1).forEach {
            state.consumeCharacter(it, this)
        }
        return state is ValidFloat
    }
}