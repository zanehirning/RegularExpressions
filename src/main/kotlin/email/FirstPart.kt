package org.example.email

class FirstPart : EmailState {
    override fun consumeCharacter(char: String, emailVerifier: EmailVerifier) {
        if (char == "@") {
            emailVerifier.state = AtSymbol()
        }
        else if (char == " ") {
            emailVerifier.state = InvalidEmail()
        }
        else {
            emailVerifier.state = FirstPart()
        }
    }
}