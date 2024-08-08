package org.example.binary

open class Zero : BinaryState {
    override fun consumeCharacter(char: String, binaryVerifier: BinaryVerifier) {
        if (char == "1") {
            binaryVerifier.state = ValidBinary()
        } else if (char == "0") {
            binaryVerifier.state = Zero()
        } else {
            binaryVerifier.state = InvalidBinary()
        }
    }
}