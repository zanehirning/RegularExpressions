package password

import Verifier
import enums.RegexType
import kotlin.test.Test

class PasswordVerifierTest {
    @Test
    fun testVerify() {
        val passwordVerifier = Verifier()
        assert(passwordVerifier.verify("aaaaH!aa", RegexType.PASSWORD))
        assert(passwordVerifier.verify("1234567*89J", RegexType.PASSWORD))
        assert(passwordVerifier.verify("!@#)#@!(fdsaS", RegexType.PASSWORD))
        assert(!passwordVerifier.verify("1!J", RegexType.PASSWORD))
        assert(!passwordVerifier.verify("123Jfdskaj!", RegexType.PASSWORD)) // ends with special character
        assert(!passwordVerifier.verify("aaaaaa!aaaa", RegexType.PASSWORD)) // no capitol
        assert(!passwordVerifier.verify("Aaaaaaab!", RegexType.PASSWORD)) // ends with special character
        assert(!passwordVerifier.verify("aaaaaaaaaaa", RegexType.PASSWORD)) // no special character or capitol
        assert(!passwordVerifier.verify("aaaaaaaaaaaaB", RegexType.PASSWORD)) // no special character or capitol
    }
}