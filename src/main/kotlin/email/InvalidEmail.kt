package org.example.email

class InvalidEmail : EmailState {
    override fun consumeCharacter(char: String, emailVerifier: EmailVerifier) {
    }
}