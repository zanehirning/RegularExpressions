package org.example.email

open class ValidEmail : EmailState {
    override fun consumeCharacter(char: String, emailVerifier: EmailVerifier) {
        emailVerifier.state = if (char == "@" || char == "." || char == " ") InvalidEmail() else ValidEmail()
    }
}