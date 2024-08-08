package binary

import org.example.binary.BinaryVerifier
import kotlin.test.Test

class BinaryVerifierTest {
    @Test
    fun testVerify() {
        val binaryVerifier = BinaryVerifier()
        assert(binaryVerifier.verify("1"))
        assert(binaryVerifier.verify("101"))
        assert(binaryVerifier.verify("1101"))
        assert(!binaryVerifier.verify("2"))
        assert(!binaryVerifier.verify("1000"))
        assert(!binaryVerifier.verify("dasfkl"))
        assert(!binaryVerifier.verify("1.0"))
        assert(!binaryVerifier.verify("1fsjdkl1"))
        assert(!binaryVerifier.verify("0"))
        assert(!binaryVerifier.verify("001"))
        assert(!binaryVerifier.verify("0101"))
    }
}