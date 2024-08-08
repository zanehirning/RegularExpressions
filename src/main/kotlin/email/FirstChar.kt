package org.example.email

class FirstChar : EmailState {
    override fun consumeCharacter(char: String, emailVerifier: EmailVerifier) {
        if (char == "@" || char == " " || char == ".") {
            emailVerifier.state = InvalidEmail()
        } else {
            emailVerifier.state = FirstPart()
        }
    }
}