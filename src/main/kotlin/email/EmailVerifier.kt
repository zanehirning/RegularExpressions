package org.example.email

class EmailVerifier {
    lateinit var state: EmailState
    fun verify(input: String): Boolean {
        state = FirstChar()
        input.chunked(1).forEach {
            state.consumeCharacter(it, this)
        }
        return state is ValidEmail
    }
}