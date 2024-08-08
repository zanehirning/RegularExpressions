package org.example.password

open class Alphanumeric : PasswordState {
    override fun consumeCharacter(char: String, passwordVerifier: PasswordVerifier) {
        if (char in "(!@#$%&*)") {
            passwordVerifier.state = SpecialChar()
        }
        if (char.get(0).isLetterOrDigit()) {
            passwordVerifier.state = Alphanumeric()
        }
        if (char.get(0).isUpperCase()) {
            passwordVerifier.state = ValidPassword()
        }
    }
}