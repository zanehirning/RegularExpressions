package org.example.password

class SpecialChar : PasswordState {
    override fun consumeCharacter(char: String, passwordVerifier: PasswordVerifier) {
        if (char.get(0).isLetterOrDigit()) {
            passwordVerifier.state = Alphanumeric()
        }
        if (char.get(0).isUpperCase()) {
            passwordVerifier.state = ValidPassword()
        }
        else {
            passwordVerifier.state = this
        }
    }
}