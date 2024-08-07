package org.example.binary

class BinaryVerifier {
    lateinit var state: BinaryState
    fun verify(input: String): Boolean {
        state = FirstBinary()
        input.chunked(1).forEach {
            state.consumeCharacter(it, this)
        }
        return state is ValidBinary
    }
}