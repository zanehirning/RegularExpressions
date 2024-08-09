package binary

import Verifier
import enums.RegexType
import kotlin.test.Test

class BinaryVerifierTest {
    @Test
    fun testVerify() {
        val binaryVerifier = Verifier()
        assert(binaryVerifier.verify("1", RegexType.BINARY))
        assert(binaryVerifier.verify("101", RegexType.BINARY))
        assert(binaryVerifier.verify("1101", RegexType.BINARY))
        assert(!binaryVerifier.verify("2", RegexType.BINARY))
        assert(!binaryVerifier.verify("1000", RegexType.BINARY))
        assert(!binaryVerifier.verify("dasfkl", RegexType.BINARY))
        assert(!binaryVerifier.verify("1.0", RegexType.BINARY))
        assert(!binaryVerifier.verify("1fsjdkl1", RegexType.BINARY))
        assert(!binaryVerifier.verify("0", RegexType.BINARY))
        assert(!binaryVerifier.verify("001", RegexType.BINARY))
        assert(!binaryVerifier.verify("0101", RegexType.BINARY))
    }
}