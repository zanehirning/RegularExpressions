package org.example.password

class PasswordVerifier {
    lateinit var state: PasswordState
    fun verify(input: String): Boolean {
        state = Alphanumeric()
        if (input.length < 8) return false
        input.chunked(1).forEach {
            state.consumeCharacter(it, this)
        }
        return state is ValidPassword
    }
}