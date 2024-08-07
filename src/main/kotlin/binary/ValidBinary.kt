package org.example.binary

class ValidBinary : BinaryState{
    override fun consumeCharacter(char: String, binaryVerifier: BinaryVerifier) {
        if (char == "1") {
            binaryVerifier.state = this
        }
        else if (char == "0") {
            binaryVerifier.state = Zero()
        }
        else {
            binaryVerifier.state = InvalidBinary()
        }
    }
}