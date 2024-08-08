package org.example.email

class Period : EmailState {
    override fun consumeCharacter(char: String, emailVerifier: EmailVerifier) {
        emailVerifier.state = if (char == "@" || char == "." || char == " ") InvalidEmail() else ThirdPart()
    }
}