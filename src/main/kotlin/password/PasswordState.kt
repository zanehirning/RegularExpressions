package org.example.password

interface PasswordState {
    fun consumeCharacter(char: String, passwordVerifier: PasswordVerifier)
}