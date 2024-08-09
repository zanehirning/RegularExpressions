package org.example.password

import password.Lowercase

class PasswordVerifier {
    lateinit var state: PasswordState
    fun verify(input: String): Boolean {
        state = Lowercase()
        if (input.length < 8) return false
        input.chunked(1).forEach {
            state.consumeCharacter(it, this)
        }
        return state is ValidPassword
    }
}