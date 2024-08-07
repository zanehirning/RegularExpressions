package org.example.integer

class IntegerVerifier {
    lateinit var state: IntegerState

    fun verify(input: String): Boolean {
        state = FirstDigit()
        input.chunked(1).forEach {
            state.consumeCharacter(it, this)
        }
        return state is Valid
    }
}